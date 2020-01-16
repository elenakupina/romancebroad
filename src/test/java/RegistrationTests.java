import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void registrationPositiveTest() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
    }
}
