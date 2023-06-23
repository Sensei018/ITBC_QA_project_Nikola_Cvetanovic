package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalDialogs extends BasePage {


    private WebElement smallModalBtn;
    private WebElement largeModalBtn;
    private WebElement closeLargeModalBtn;
    private WebElement closeSmallModalBtn;

    public WebElement getCloseSmallModalBtn() {
        this.closeSmallModalBtn = getDriver().findElement(By.xpath("//button[@id='closeSmallModal']"));
        return closeSmallModalBtn;
    }


    public WebElement getCloseLargeModalBtn() {
        this.closeLargeModalBtn = getDriver().findElement(By.xpath("//button[@id='closeLargeModal']"));
        return closeLargeModalBtn;
    }


    public WebElement getLargeModalBtn() {
        this.largeModalBtn = getDriver().findElement(By.xpath("//button[@id='showLargeModal']"));
        return largeModalBtn;

    }

    public WebElement getSmallModalBtn() {
        this.smallModalBtn = getDriver().findElement(By.xpath("//button[@id='showSmallModal']"));
        return smallModalBtn;
    }

    public ModalDialogs(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void openModalDialogsUrl() {
        getDriver().get("https://demoqa.com/modal-dialogs");
    }

    public void setSmallModalBtn() {
        getSmallModalBtn().click();
    }

    public void setLargeModalBtn() {
        getLargeModalBtn().click();
    }

    public void setCloseLargeModalBtn() {
        getCloseLargeModalBtn().click();
    }

    public void setCloseSmallModalBtn() {
        getCloseSmallModalBtn().click();
    }

}
