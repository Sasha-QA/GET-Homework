import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdministratorPage {

    public WebDriver driver;

    private By language = By.id("js-XFUniqueId15");
    private By enLang = By.linkText("English (US)");
    protected By membersEn = By.cssSelector("a[data-nav-id='members']");
    public static final String EXPECTED_MESSAGE = "Members";
    public static final String ADMINISTRATOR_URL = "https://forum.krstarica.com/members/?key=administrators";

    public AdministratorPage(WebDriver driver){
        this.driver=driver;
    }

    public void chooseLang(){
        driver.findElement(language).click();
        driver.findElement(enLang).click();
    }

}
