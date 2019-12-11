import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI {

    String expectedUrlMedia = "https://romanceabroad.com/media/index";

    @Test
    public void testMediaPage() {
        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrlMedia);
    }
}
