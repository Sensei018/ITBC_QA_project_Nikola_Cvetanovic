package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox extends BasePage {


    private WebElement homeCheckBox;

    private WebElement resultMessage;


    public WebElement getResultMessage() {
        this.resultMessage = getDriver().findElement(By.xpath("//div[@id='result']"));
        return resultMessage;
    }


    public WebElement getHomeCheckBox() {
        this.homeCheckBox = getDriver().findElement(By.cssSelector("svg[class='rct-icon rct-icon-uncheck']"));
        return homeCheckBox;
    }


    public void setResultMessage(WebElement resultMessage) {
        this.resultMessage = resultMessage;
    }


    public void setHomeCheckBox() {
        getHomeCheckBox().click();
    }

    public void open() {
        getDriver().get("https://demoqa.com/checkbox");

    }

    public CheckBox(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
}
