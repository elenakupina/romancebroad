import org.testng.Assert;
import org.testng.annotations.Test;

public class HowItWorksTests extends BaseUI {

    String expectedUrlHowItWorks = "https://romanceabroad.com/content/view/how-it-works";

    @Test
    public void testHowWeWorkPage() {
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrlHowItWorks);
    }
}
