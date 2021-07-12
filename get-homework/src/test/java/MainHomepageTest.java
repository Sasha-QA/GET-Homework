import org.jsoup.Connection;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainHomepageTest extends BaseTest {

    @Test (priority = 0)
    public void testAdminPage() {
        KrstaricaHomepage homepage = new KrstaricaHomepage(createDriver());
        homepage.clickMemebers();
        AdministratorPage admin = homepage.clickAdministrator();

        Assert.assertEquals(homepage.getAddress(), AdministratorPage.ADMINISTRATOR_URL);
    }

    @Test (priority = 1)
    public void testGamePage(){
        KrstaricaHomepage homepage = new KrstaricaHomepage(createDriver());
        GamesPage games = homepage.clickGames();

        Assert.assertEquals(homepage.getAddress(), GamesPage.GAMES_URL);
    }

    @Test (priority = 2)
    public void testBlogPage(){
        KrstaricaHomepage homepage = new KrstaricaHomepage(createDriver());
        homepage.clickBlogs();

        Assert.assertEquals(homepage.getAddress(), KrstaricaHomepage.BLOG_URL);
    }

    @Test (priority = 3)
    public void testRulesPage(){
        KrstaricaHomepage homepage = new KrstaricaHomepage(createDriver());
        homepage.clickRules();

        Assert.assertEquals(homepage.getAddress(), KrstaricaHomepage.RULES_PAGE);
    }


}
