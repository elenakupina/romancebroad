import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TourTests extends BaseUI{

    @Test
    public void testTourPage() {
        WebElement linkTourPage = driver.findElement(Locators.LINK_TOUR);
        linkTourPage.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, Data.expectedUrlTour);
        driver.findElement(Locators.SEARCH_PRODUCT_FIELD).sendKeys("Kiev");
        driver.findElement(Locators.BUTTON_SEARCH).click();
    }
}
