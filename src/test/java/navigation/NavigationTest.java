package navigation;

import Base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoadingPage().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://Youtube.com/");

    }
    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTest("New Window");
    }

}
