package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {

    private WebDriver driver;
    private String editorIFrameID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]/span");

    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToTheMainArea();
    }
    public void setTextAre(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToTheMainArea();
    }
    public void decreaseIndentButton(){
        driver.findElement(decreaseIndentButton).click();
    }
    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToTheMainArea();
        return text;
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIFrameID);
    }
    public void switchToTheMainArea(){
        driver.switchTo().parentFrame();
    }
}
