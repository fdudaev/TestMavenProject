package Base;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.concurrent.TimeUnit;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources1/chromedriver.exe"); // creating property file
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        goHome();

        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

   // @AfterClass
    public void tearDown(){
       driver.quit();
    }


}
/*
//driver.manage().window().setSize(new Dimension(375, 812)); // set a size to specific size you want
        //driver.manage().window().fullscreen();

       WebElement inputLinks = driver.findElement(By.linkText("Inputs"));
        inputLinks.click();

    WebElement shift = driver.findElement(By.linkText("Shifting Content"));
    WebElement menu = driver.findElement(By.linkText("Example 1: Menu Element"));
        shift.click();
                menu.click();


                List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
 */