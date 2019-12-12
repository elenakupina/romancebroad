import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI {

    @Test
    public void testMediaPage() {
        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, Data.expectedUrlMedia);
    }
}
