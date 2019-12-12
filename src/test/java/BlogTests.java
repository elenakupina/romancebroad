import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUI{

    @Test
    public void testBlogPage() {
        driver.findElement(Locators.LINK_BLOG).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, Data.expectedUrlBlog);
    }
}
