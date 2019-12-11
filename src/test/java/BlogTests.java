import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUI{

    String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";

    @Test
    public void testBlogPage() {
        driver.findElement(Locators.LINK_BLOG).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrlBlog);
    }
}
