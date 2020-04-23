import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TourTests extends BaseUI{

    @Test
    public void testTourPage() {
        WebElement linkTourPage = driver.findElement(Locators.LINK_TOUR);
        linkTourPage.click();
        wait = new WebDriverWait(driver, 30);
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, Data.expectedUrlTour);
        wait = new WebDriverWait(driver, 30);
        driver.findElement(Locators.SEARCH_PRODUCT_FIELD).sendKeys("Kiev");
        driver.findElement(Locators.BUTTON_SEARCH).click();
    }
}
