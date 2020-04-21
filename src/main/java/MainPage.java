import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinButton() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }

    public void completeFirstPartOfRegistration() {
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void completeSecondPartOfRegistration() {
        driver.findElement(Locators.TEXT_FIELD_USERNAME).sendKeys(generateNewNumber(Data.username, 5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PHONE)));
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);

        List<WebElement> daysList = driver.findElements(Locators.DAYS_LIST);
        driver.findElement(Locators.DAY_SELECT).click();
        for (WebElement day : daysList) {
            if (day.getText().contains(Data.day)) {
                day.click();
            }
        }

        List<WebElement> monthsList = driver.findElements(Locators.MONTHS_LIST);
        driver.findElement(Locators.MONTH_SELECT).click();
        for (WebElement month : monthsList) {
            if (month.getText().contains(Data.month)) {
                month.click();
            }
        }

        List<WebElement> yearsList = driver.findElements(Locators.YEARS_LIST);
        driver.findElement(Locators.YEAR_SELECT).click();
        for (WebElement year : yearsList) {
            if (year.getText().contains(Data.year)) {
                year.click();
            }
        }
    }
}
