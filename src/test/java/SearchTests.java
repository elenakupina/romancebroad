import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {

    @Test
    public void testSearchPage() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrl = driver.getCurrentUrl();
        softAssert.assertEquals(currentUrl, Data.expectedUrlSearch, "Url is not correct");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByText(dropDownListSortBy, "Views");
        softAssert.assertAll("wrong url");
    }
}
