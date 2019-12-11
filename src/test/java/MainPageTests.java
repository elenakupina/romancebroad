import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MainPageTests extends  BaseUI{

    @Test
    public void testMainPage() {
        //Xpath locators
        driver.findElement(By.xpath("//strong[contains(text(),'Ukrainian Girls Dating Site')]"));
        driver.findElement(By.id("ajax_login_link"));
        driver.findElement(By.xpath("//button[@id='show-registration-block']"));
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']"));
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']"));
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']"));
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/users/search']"));
        driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']")).click();
        driver.findElement(Locators.BUTTON_HOME).click();
        driver.findElement(By.id("slidemenu-close")).click();
        driver.findElement(By.xpath("//div[@class='logo-mobile-version top-menu-item']")).click();

        //Css selectors
        driver.findElement(Locators.LINK_HOW_WE_WORK);
        driver.findElement(Locators.LINK_TOUR);
        driver.findElement(Locators.LINK_GIFTS);
        driver.findElement(Locators.LINK_SEARCH);
        driver.findElement(Locators.LINK_REGISTRATION);
        driver.findElement(Locators.LINK_SIGN_IN);
    }
}
