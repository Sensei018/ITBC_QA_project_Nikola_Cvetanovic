package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Links extends BasePage {

    private WebElement created;
    private WebElement response;


    public WebElement getResponse() {
        this.response = getDriver().findElement(By.xpath("//b[contains(text(),'Created')]"));
        return response;
    }

    public WebElement getCreated() {
        this.created = getDriver().findElement(By.xpath("//a[@id='created']"));
        return created;
    }

    public void setCreated() {
        getCreated().click();

    }

    public void setResponse() {
        getCreated().isDisplayed();
    }


    public void openLinksUrl() {
        getDriver().get("https://demoqa.com/links");
    }


    public Links(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
}
