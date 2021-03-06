import org.openqa.selenium.By;

public class Locators {

    public static final By LINK_HOW_WE_WORK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    public static final By LINK_GIFTS = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    public static final By LINK_TOUR = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    public static final By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    public static final By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    public static final By SEARCH_PRODUCT_FIELD = By.xpath("//input[@id='search_product']");
    public static final By BUTTON_SEARCH = By.xpath("//button[@id='search_friend']");
    public static final By BUTTON_HOME = By.xpath("//a[@class='uam-top link-open-menu btn-slide']");
    public static final By LINK_VIDEO = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By BUTTON_PLAY_VIDEO = By.xpath("//button[@class='ytp-large-play-button ytp-button']");
    public static final By TAB_OF_MAIN_PAGE = By.xpath("//ul[@class='navbar-nav']//li");
    public static final By TITLE_OF_PAGE = By.xpath("//h1");
    public static final By IMAGES = By.xpath("//a[@class='g-pic-border g-rounded']");

    //registration page
    public static final By LINK_REGISTRATION = By.cssSelector("#show-registration-block");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_USERNAME = By.cssSelector("input#nickname");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]'");
    public static final By BUTTON_REGISTRATION = By.cssSelector("button#show-registration-block");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By DAY_SELECT = By.cssSelector("#daySelect");
    public static final By MONTH_SELECT = By.cssSelector("#monthSelect");
    public static final By YEAR_SELECT = By.cssSelector("#yearSelect");
    public static final By YEARS_LIST = By.xpath("//li[@data-handler='selectYear']");
    public static final By MONTHS_LIST = By.xpath("//li[@data-handler='selectMonth']");
    public static final By DAYS_LIST = By.xpath("//li[@data-handler='selectDay']");
    public static final By CHECKBOX_CONFORMATION = By.cssSelector("input#confirmation");

    //Search page
    public static final By LINK_SEARCH = By.cssSelector("a[href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By DROP_DOWN_MAX_AGE = By.cssSelector("select#age_max");


}
