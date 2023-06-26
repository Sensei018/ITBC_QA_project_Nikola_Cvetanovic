package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage extends BasePage {


    public void openElements() {
        getDriver().get("https://demoqa.com/elements");
    }

    public ElementsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

}
