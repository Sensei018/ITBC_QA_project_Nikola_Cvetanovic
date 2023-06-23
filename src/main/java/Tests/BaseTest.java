package Tests;

import Pages.*;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import javax.xml.soap.Text;
import java.time.Duration;

public class BaseTest {


    private WebDriver driver;
    protected WebDriverWait wait;
    private ElementsPage elementsPage;
    private TextBox textBox;

    private CheckBox checkBox;
    private Links links;
    private ProgressBar progressBar;
    private Tabs tabs;
    private BookStore bookStore;
    private ModalDialogs modalDialogs;


    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C://Users//P//Desktop//chromedriver.exe");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        elementsPage = new ElementsPage(driver, wait);
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        textBox = new TextBox(driver, wait);
        checkBox = new CheckBox(driver, wait);
        links = new Links(driver, wait);
        progressBar = new ProgressBar(driver, wait);
        tabs = new Tabs(driver, wait);
        bookStore = new BookStore(driver, wait);
        modalDialogs = new ModalDialogs(driver, wait);


    }

    @BeforeMethod
    public void beforeEachTest() {
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        executor.executeScript("window.scrollTo(0, 500)");
    }


    @DataProvider(name = "testDataProvider")
    public Object[][] testData() {
        return new Object[][]{
                {"", "", "", ""}, {"a", "a@a.aa", "a", "a"}, {"", "johndoe@example.co", "", ""}
        };
    }

    @DataProvider(name = "testDataProvider2")
    public Object[][] testValidDatas() {
        return new Object[][]{
                {"John Doe", "johndoe@example.co", "Robert Robertson, 1234", "106 DOYERS ST."}
        };
    }


    public WebDriver getDriver() {
        return this.driver;
    }

    public void setWait(WebDriverWait wait) {
        this.wait = wait;
    }

    public ElementsPage getElementsPage() {
        return this.elementsPage;
    }

    public Links getLinksPage() {
        return this.links;
    }

    public ProgressBar getProgressBar() {
        return this.progressBar;
    }

    public TextBox getTextBox() {
        return this.textBox;
    }


    public CheckBox getHomeCheckBox() {
        return this.checkBox;
    }

    public Tabs getTabs() {
        return this.tabs;
    }

    public BookStore getBookStore() {
        return this.bookStore;
    }

    public ModalDialogs getModalDialogs() {
        return this.modalDialogs;
    }


    @AfterClass
    public void cleanUp() {
        driver.close();
    }
}
