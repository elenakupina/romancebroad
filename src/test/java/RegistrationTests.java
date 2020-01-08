import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTests extends BaseUI {

    @Test
    public void registrationPositiveTest() {

        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_USERNAME).sendKeys(Data.username);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PHONE)));
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        WebElement checkBoxConformation = driver.findElement(By.cssSelector("input#confirmation"));
        boolean selectedCheckbox = checkBoxConformation.isSelected();
        checkBoxConformation.click();
    }
}
