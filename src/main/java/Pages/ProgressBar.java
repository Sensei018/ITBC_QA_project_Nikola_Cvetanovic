package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBar extends BasePage {

    private WebElement progressBarBtn;
    private WebElement progressBarStatus;


    public WebElement getProgressBarStatus() {
        this.progressBarStatus = getDriver().findElement(By.xpath("//div[contains(text(),'100%')]"));
        return progressBarStatus;
    }


    public WebElement getProgressBarBtn() {
        this.progressBarBtn = getDriver().findElement(By.xpath("//button[@id='startStopButton']"));
        return progressBarBtn;
    }


    public void setProgressBarBtn() {
        getProgressBarBtn().click();
    }

    public void setProgressBarStatus() {
        getProgressBarStatus().isDisplayed();
    }


    public void openProgressBarUrl() {
        getDriver().get("https://demoqa.com/progress-bar");

    }

    public ProgressBar(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
}
