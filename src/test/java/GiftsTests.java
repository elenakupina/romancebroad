import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftsTests extends BaseUI{

    @Test
    public void testGiftsPage() {
        driver.findElement(Locators.LINK_GIFTS).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, Data.expectedUrlGifts);
    }
}
