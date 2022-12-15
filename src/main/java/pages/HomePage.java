package pages;
// this class will contain:
// 1. Fields - that will be representing elements on home page
// 2. Methods - to interact with those elements

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public HoversPage clickHover(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoadingPage(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
}
    private void clickLink(String clickLink){
        driver.findElement(By.linkText(clickLink)).click();
    }
}
