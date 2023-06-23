package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.swing.*;


public class Tests extends BaseTest {


    @Test
    public void verifyElementsPage() {
        getElementsPage().openElements();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/elements"));
    }


    @Test(priority = 3)
    public void verifyCheckBoxPage() {
        getHomeCheckBox().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/checkbox"));
    }


    @Test(priority = 5)
    public void verifyClickabilityOfCheckBox() {
        getHomeCheckBox().open();
        getHomeCheckBox().setHomeCheckBox();
        Assert.assertTrue(getDriver().findElement(By.xpath("//div[@id='result']")).isDisplayed());
    }

    @Test(priority = 7)
    public void verifyTextBoxPage() {
        getElementsPage().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/text-box"));

    }

    @Test(dataProvider = "testDataProvider2", priority = 10)
    public void verifyOutputVisibility(String name, String email, String currentAddress, String permanentAddress) {
        getTextBox().open();
        getTextBox().getFullName().sendKeys(name);
        getTextBox().getEmail().sendKeys(email);
        getTextBox().getCurrentAddress().sendKeys(currentAddress);
        getTextBox().getPermanentAddress().sendKeys(permanentAddress);
        getTextBox().getSubmitBtn().click();
        Assert.assertTrue(getDriver().findElement(By.xpath("//div[@id='output']")).isDisplayed());
    }


    @Test(dataProvider = "testDataProvider", priority = 20)
    public void verifyOutputMessage(String name, String email, String currentAddress, String permanentAddress) {
        getTextBox().open();
        getTextBox().enterFullName(name);
        getTextBox().enterEmail(email);
        getTextBox().enterCurrentAddress(currentAddress);
        getTextBox().enterPermanentAddress(permanentAddress);
        getTextBox().getSubmitBtn().click();
        Assert.assertTrue(getDriver().findElement(By.xpath("//div[@id='output']")).isDisplayed());
    }

    @Test(priority = 30)
    public void verifyApiCall() {
        getLinksPage().openLinksUrl();
        getLinksPage().setCreated();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Created')]")));
        Assert.assertTrue(getDriver().findElement(By.xpath("//b[contains(text(),'Created')]")).isDisplayed());

    }


    @Test(priority = 31)
    public void verifyProgressBarPage() {
        getProgressBar().openProgressBarUrl();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/progress-bar"));

    }


    @Test(priority = 32)
    public void verifyProgressBarFunctionality() {
        getProgressBar().openProgressBarUrl();
        getProgressBar().setProgressBarBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'100%')]")));
        Assert.assertTrue(getDriver().findElement(By.xpath("//div[contains(text(),'100%')]")).isDisplayed());

    }

    @Test(priority = 40)
    public void verifyTabOrigin() {
        getTabs().openTabsUrl();
        getTabs().setOrigin();
        Assert.assertTrue(getDriver().findElement(By.xpath("//div[@id='demo-tabpane-origin']")).isDisplayed());
    }

    @Test(priority = 41)
    public void verifyTabWhat() {
        getTabs().openTabsUrl();
        getTabs().setWhat();
        Assert.assertTrue(getDriver().findElement(By.xpath("//div[@id='demo-tabpane-what']")).isDisplayed());
    }

    @Test(priority = 44)
    public void verifyTabUse() {
        getTabs().openTabsUrl();
        getTabs().setUse();
        Assert.assertTrue(getDriver().findElement(By.xpath("//div[@id='demo-tabpane-use']")).isDisplayed());

    }

    @Test(priority = 45)
    public void verifyBookSelection() {
        getBookStore().openProgressBarUrl();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Learning JavaScript Design Patterns')]")));

        getBookStore().setBuyBook();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/books?book=9781449331818"));


    }

    @Test(priority = 48)
    public void verifyLargeModalDialogVisibility() {
        getModalDialogs().openModalDialogsUrl();
        getModalDialogs().setLargeModalBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("//div[@class='modal-content']")).isDisplayed());
        getModalDialogs().setCloseLargeModalBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("//button[@id='showLargeModal']")).isDisplayed());


    }

    @Test(priority = 50)
    public void verifySmallModalDialogVisibility() {
        getModalDialogs().openModalDialogsUrl();
        getModalDialogs().setSmallModalBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("//div[@class='modal-content']")).isDisplayed());
        getModalDialogs().setCloseSmallModalBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("//button[@id='showSmallModal']")).isDisplayed());


    }


}







