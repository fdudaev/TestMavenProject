package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goForward(){
        navigate.forward();
    }
    public void goBack (){
        navigate.back();
    }
    public void refreshPage(){
        navigate.refresh();
    }
    public void goTo(String url){
        navigate.to(url);
    }
    public void switchToTest(String tabTitle){
        var windows = driver.getWindowHandles();

        System.out.println("Number of tabs: "+windows.size());
        System.out.println("Number of tabs: ");
        windows.forEach(System.out::println);
        for(String window : windows){
            System.out.println("Switching to window "+window);
            driver.switchTo().window(window);

            System.out.println("Current window title is : " + driver.getTitle());
            if (tabTitle.equals(driver.getTitle())){
                break;
            }


        }

    }


}
