import org.testng.Assert;
import org.testng.annotations.Test;

public class HowItWorksTests extends BaseUI {

    @Test
    public void testHowWeWorkPage() {
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, Data.expectedUrlHowItWorks);
    }
}
