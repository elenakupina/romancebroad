import org.openqa.selenium.By;
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

        List<WebElement> daysList = driver.findElements(By.xpath("//li[@data-handler='selectDay']"));
        driver.findElement(By.cssSelector("#daySelect")).click();
        for (WebElement day: daysList) {
            if( day.getText().contains("3")) {
                day.click();
            }
        }

        List<WebElement> monthsList = driver.findElements(By.xpath("//li[@data-handler='selectMonth']"));
        driver.findElement(By.cssSelector("#monthSelect")).click();
        for (WebElement month: monthsList) {
            if( month.getText().contains("May")) {
                month.click();
            }
        }

        List<WebElement> yearsList = driver.findElements(By.xpath("//li[@data-handler='selectYear']"));
        driver.findElement(By.cssSelector("#yearSelect")).click();
        for (WebElement year: yearsList) {
            if( year.getText().contains("1999")) {
                year.click();
            }
        }

        WebElement checkBoxConformation = driver.findElement(By.cssSelector("input#confirmation"));
        boolean selectedCheckbox = checkBoxConformation.isSelected();
        checkBoxConformation.click();
    }
}
