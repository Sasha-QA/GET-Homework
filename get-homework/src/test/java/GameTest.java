import org.testng.Assert;
import org.testng.annotations.Test;

public class GameTest extends BaseTest{

    @Test(priority = 0)
    public void testSortingOption(){
        KrstaricaHomepage homepage = new KrstaricaHomepage(createDriver());
        GamesPage game = homepage.clickGames();
        game.sortGames();
        game.chooseSortingOption();

        String actual = driver.findElement(game.sortGames).getText();
        Assert.assertTrue(actual.contains(GamesPage.EXPECTED_MESSAGE), "Non-exsisting message!");
    }

    @Test(priority = 1)
    public void testGameChosing(){
        KrstaricaHomepage homepage = new KrstaricaHomepage(createDriver());
        GamesPage game = homepage.clickGames();
        game.sortGames();
        game.chooseSortingOption();
        game.goToNextSlide();
        game.chooseGame();

        Assert.assertEquals(homepage.getAddress(), GamesPage.CHOSEN_GAME);
    }

    @Test (priority = 2)
    public void testGoingBack(){
        KrstaricaHomepage homepage = new KrstaricaHomepage(createDriver());
        GamesPage game = homepage.clickGames();
        game.sortGames();
        game.chooseSortingOption();
        game.goToNextSlide();
        game.chooseGame();
        game.clickOnHomepage();

        Assert.assertEquals(homepage.getAddress(), KrstaricaHomepage.KRSTARICA_PAGE);
    }

}
