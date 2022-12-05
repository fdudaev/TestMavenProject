package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By userNameField = By.id("username");
    private By passwordField = By.id("password");
    private By logingButton =  By.cssSelector("#login button");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUsername(String  username){
        driver.findElement(userNameField).sendKeys(username);
    }
    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickLogingButton(){
        driver.findElement(logingButton).click();
        return new SecureAreaPage(driver);
    }

}
