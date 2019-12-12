import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void registrationPositiveTest() {

        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_USERNAME).sendKeys(Data.username);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
    }
}
