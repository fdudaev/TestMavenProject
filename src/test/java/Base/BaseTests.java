package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources1/chromedriver.exe"); // creating property file
        driver =new ChromeDriver(getChromeOptions());
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        goHome();
        setCookie();

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

    @AfterMethod

    public void takeScreenshot(){
        TakesScreenshot camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);

        try {
            File name = new File("resources1/screenshots/test2.npg");
            FileUtils.copyFile(screenshot, name);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }



    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars"); // to remove selenium control bar a bar on chrome
        //options.setHeadless(true); // to run your test without opening a browser
        return options;
    }
    private void setCookie(){
        Cookie cookie = new Cookie.Builder("myCookie", "123").domain("https://the-internet.herokuapp.com/").build();
        driver.manage().addCookie(cookie);
    }


}

