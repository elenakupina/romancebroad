import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainPageTests extends BaseUI {

    @Test
    public void testVideo() {
        WebElement video = driver.findElement(Locators.LINK_VIDEO);
        driver.switchTo().frame(video);
        driver.findElement(Locators.BUTTON_PLAY_VIDEO).click();
    }
}
