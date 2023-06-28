package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStore extends BasePage {


    private WebElement buyBook;


    public WebElement getBuyBook() {
        this.buyBook = getDriver().findElement(By.xpath("//a[contains(text(),'Learning JavaScript Design Patterns')]"));
        return buyBook;
    }

    public BookStore(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void setBuyBook() {
        getBuyBook().click();
    }

    public void openProgressBarUrl() {
        getDriver().get("https://demoqa.com/books");

    }
}
