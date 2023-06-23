package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tabs extends BasePage {


    private WebElement origin;
    private WebElement use;
    private WebElement what;


    public WebElement getUse() {
        this.use = getDriver().findElement(By.xpath("//a[@id='demo-tab-use']"));
        return use;
    }

    public WebElement getWhat() {
        this.what = getDriver().findElement(By.xpath("//a[@id='demo-tab-what']"));
        return what;
    }

    public WebElement getOrigin() {
        this.origin = getDriver().findElement(By.xpath("//a[@id='demo-tab-origin']"));
        return origin;
    }


    public void setWhat() {
        getWhat().click();
    }

    public void setOrigin() {
        getOrigin().click();
    }

    public void setUse() {
        getUse().click();
    }


    public void openTabsUrl() {
        getDriver().get("https://demoqa.com/tabs");
    }

    public Tabs(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
}
