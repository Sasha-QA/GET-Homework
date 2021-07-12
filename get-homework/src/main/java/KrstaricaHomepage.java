import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KrstaricaHomepage {

    public WebDriver driver;

    public static final String HOMEPAGE = "https://forum.krstarica.com/";
    public static final String BLOG_URL = "https://forum.krstarica.com/forums/blogovi.397/";
    public static final String KRSTARICA_PAGE = "https://www.krstarica.com/";
    public static final String RULES_PAGE = "https://forum.krstarica.com/help/pravilnik-foruma/";
    public By rules = By.linkText("Pravilnik");
    public By games = By.cssSelector("a[href='https://igre.krstarica.com/'][data-xf-key='5']");
    public By blogs = By.linkText("Blogovi");
    public By members = By.partialLinkText("Člano");
    public By administrator = By.cssSelector("div[data-ocm-class='offCanvasMenu offCanvasMenu--blocks'] a:nth-child(8)");

    public KrstaricaHomepage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMemebers(){
        driver.findElement(members).click();}

    public AdministratorPage clickAdministrator(){
        driver.findElement(administrator).click();
        return new AdministratorPage(driver);
    }

    public GamesPage clickGames(){
        driver.findElement(games).click();
        return new GamesPage(driver);
    }

    public void clickRules(){
        driver.findElement(rules).click();
    }

    public void clickBlogs(){
        driver.findElement(blogs).click();
    }

    public String getAddress(){
        return driver.getCurrentUrl();
    }



}
