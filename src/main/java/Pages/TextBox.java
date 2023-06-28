package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TextBox extends BasePage{

    private WebElement fullName;
    private WebElement email;
    private WebElement currentAddress;
    private WebElement permanentAddress;
    private WebElement submitBtn;
    private WebElement outputMessage;



    public WebElement getOutputMessage() {
       this.outputMessage= getDriver().findElement(By.xpath("//div[@id='output']"));
        return outputMessage;
    }
    public WebElement getSubmitBtn() {
        this.submitBtn= getDriver().findElement(By.xpath("//button[@id='submit']"));
        return submitBtn;
    }

    public WebElement getPermanentAddress() {
        this.permanentAddress= getDriver().findElement(By.xpath("//textarea[@id='permanentAddress']"));
        return permanentAddress;
    }

    public WebElement getCurrentAddress() {
        this.currentAddress= getDriver().findElement(By.xpath("//textarea[@id='currentAddress']"));
        return currentAddress;
    }
    public WebElement getEmail() {
        this.email= getDriver().findElement(By.xpath("//input[@id='userEmail']"));
        return email;
    }
    public WebElement getFullName() {
        this.fullName= getDriver().findElement(By.xpath("//input[@id='userName']"));
        return fullName;
    }



    public void enterFullName(String name){
        getFullName().sendKeys(name);
    }

    public void enterEmail(String email){
        getEmail().sendKeys(email);
    }

    public void enterCurrentAddress(String currentAddress){
        getCurrentAddress().sendKeys(currentAddress);
    }

    public void enterPermanentAddress(String permanentAddress){
        getPermanentAddress().sendKeys(permanentAddress);
    }

    public void showOutputMessage(){
        getOutputMessage().isDisplayed();
    }

    public void setSubmitBtn(){
        getSubmitBtn().click();
    }

    public void open(){
        getDriver().get("https://demoqa.com/text-box");

    }


    public TextBox(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
}
