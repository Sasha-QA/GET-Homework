import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GamesPage {

    public WebDriver driver;

    public static final String GAMES_URL = "https://igre.krstarica.com/";
    public static final String CHOSEN_GAME = "https://igre.krstarica.com/mahjong/mahjongg-3d-5-pyramids/";
    public static final String EXPECTED_MESSAGE = "Abecedno (A-Z)";

    private By nextButton = By.cssSelector("div:nth-child(4) div:nth-child(2) div:nth-child(2) div:nth-child(1) a:nth-child(2)");
    private By previousButton = By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > main:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > a:nth-child(1)");
    public By sortGames = By.className("selecter-selected");
    public By aToZSort = By.cssSelector("span[data-value='6']");
    private By mahjong = By.cssSelector("div:nth-child(4) div:nth-child(2) div:nth-child(1) ul:nth-child(1) li:nth-child(11) div:nth-child(1) figure:nth-child(1) a:nth-child(1) img:nth-child(1)");
    private By mahjong_link = By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > main:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(11) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > a:nth-child(1)");
    public By backToHomepage = By.cssSelector("body > div:nth-child(1) > header:nth-child(1) > div:nth-child(1) > nav:nth-child(3) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)");

    public GamesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sortGames(){
        driver.findElement(sortGames).click();
    }

    public void chooseSortingOption(){
        driver.findElement(aToZSort).click();
    }

    public void goToNextSlide(){
        driver.findElement(nextButton).click();
    }

    public void goToPreviousSlide(){
        driver.findElement(previousButton).click();
    }

    public void chooseGame(){
        Actions action = new Actions(driver);
        WebElement game = driver.findElement(mahjong);
        action.moveToElement(game).moveToElement(driver.findElement(mahjong_link)).click().build().perform();
    }

    public KrstaricaHomepage clickOnHomepage(){
        driver.findElement(backToHomepage).click();
        return new KrstaricaHomepage(driver);
    }
}
