package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;
    private By textBlocks = By.className("jscroll-added");
    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Scroll until paragraph with index specified is in view
     * @param index - 1 based
     */
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight);";  // new variable to pass JavaScript .scrollTo(); method 0 is for horizontal scroll
        var jsExecutor = ((JavascriptExecutor)driver);

        while(getNumberOfParagraphsPresent() < index){
            jsExecutor.executeScript(script);
        }

    }
    public int getNumberOfParagraphsPresent(){
        return driver.findElements(textBlocks).size();
    }
}
