import org.openqa.selenium.By;

public class Locators {

    public static final By LINK_HOW_WE_WORK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By LINK_SEARCH = By.cssSelector("a[href='https://romanceabroad.com/users/search']");
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    public static final By LINK_GIFTS = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    public static final By LINK_TOUR = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    public static final By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    public static final By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    public static final By SEARCH_PRODUCT_FIELD = By.xpath("//input[@id='search_product']");
    public static final By BUTTON_SEARCH = By.xpath("//button[@id='search_friend']");
    public static final By LINK_REGISTRATION = By.cssSelector("#show-registration-block");
    public static final By BUTTON_HOME = By.xpath("//i[@class='fa fa-bars fa-lg item']");

    //registration page
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_USERNAME = By.cssSelector("input#nickname");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]'");
    public static final By BUTTON_REGISTRATION = By.cssSelector("button#show-registration-block");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
}
