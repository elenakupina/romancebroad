import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TourTests extends BaseUI{

    String expectedUrlTour = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";

    @Test
    public void testTourPage() {
        WebElement linkTourPage = driver.findElement(Locators.LINK_TOUR);
        linkTourPage.click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrlTour);
        driver.findElement(Locators.SEARCH_PRODUCT_FIELD).sendKeys("Kiev");
        driver.findElement(Locators.BUTTON_SEARCH).click();
    }
}
