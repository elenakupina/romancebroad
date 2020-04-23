import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {

    @Test
    public void testSearchPage() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrl = driver.getCurrentUrl();
        wait = new WebDriverWait(driver, 30);
        softAssert.assertEquals(currentUrl, Data.expectedUrlSearch, "Url is not correct");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByText(dropDownListSortBy, "Views");
        softAssert.assertAll("wrong url");
    }
}
