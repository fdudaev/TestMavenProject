package hover;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTest extends BaseTests {


    @Test
    public void tesHoverUser1(){
        var hoversPage = homePage.clickHover();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not Displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title is incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");


    }

}
