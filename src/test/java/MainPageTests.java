import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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

        String actualTitle;
        String actualUrlPrettyWomen;

        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if(info.contains("WORK")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                Assert.assertEquals(Data.expectedTitleHowWeWork, actualTitle);
            }
            if(info.contains("PRETTY WOMEN")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePrettyWomen, actualTitle);
                Assert.assertEquals(actualUrlPrettyWomen, Data.expectedUrlPrettyWomen);
                driver.findElement(By.xpath("//a[@class='g-pic-border g-rounded']")).isDisplayed();
            }

            driver.get(Data.MAIN_URL);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        }
    }
}
