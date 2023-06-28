package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Slider extends BasePage {

    private WebElement slider;
    private WebElement sliderValueBox;

    public Slider(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSlider() {
        this.slider = getDriver().findElement(By.xpath("//input[@type='range']"));
        return this.slider;
    }

    public WebElement getSliderValueBox() {
        this.sliderValueBox = getDriver().findElement(By.xpath("//input[@id='sliderValue']"));
        return this.sliderValueBox;
    }

    public Slider moveSliderLeftBy(int value) {
        for (int i = 0; i < value; i++) {
            getSlider().sendKeys(Keys.ARROW_LEFT);
        }
        return this;
    }

    public Slider moveSliderRightBy(int value) {
        for (int i = 0; i < value; i++) {
            getSlider().sendKeys(Keys.ARROW_RIGHT);
        }
        return this;
    }

    public int getSliderValue() {
        return Integer.parseInt(getSliderValueBox().getAttribute("value"));
    }


    public void openSliderUrl() {
        getDriver().get("https://demoqa.com/slider");

    }
}
