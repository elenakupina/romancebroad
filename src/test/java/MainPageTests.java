import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPageTests extends BaseUI {

    @Test
    public void testVideo() {
        WebElement video = driver.findElement(Locators.LINK_VIDEO);
        driver.switchTo().frame(video);
        driver.findElement(Locators.BUTTON_PLAY_VIDEO).click();
    }

    @Test
    public void checkTabLinksTest() {

        List<WebElement> links = driver.findElements(Locators.LIST_TAB_LINKS);
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.MAIN_URL);
            links = driver.findElements(Locators.LIST_TAB_LINKS);
        }
    }
}
