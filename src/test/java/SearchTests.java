import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI{

    String expectedUrlSearch = "https://romanceabroad.com/users/search";

    @Test
    public void testSearchPage() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrlSearch);
    }
}
