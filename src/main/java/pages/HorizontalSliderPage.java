package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By scroller = By.className("sliderContainer");
    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void holdScroll(){
        driver.findElement(scroller).sendKeys();
    }




}
