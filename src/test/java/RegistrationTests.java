import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void registrationPositiveTest() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
        WebElement checkBoxConformation = driver.findElement(Locators.CHECKBOX_CONFORMATION);

        if (!checkBoxConformation.isSelected()) {
            checkBoxConformation.click();

        }else {
            Assert.fail("Checkbox is already selected");
        }
    }
}
