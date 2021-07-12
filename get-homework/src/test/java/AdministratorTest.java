import org.testng.Assert;
import org.testng.annotations.Test;

public class AdministratorTest extends BaseTest {

    @Test(priority = 0)
    public void testLanguage(){
        KrstaricaHomepage homepage = new KrstaricaHomepage(createDriver());
        homepage.clickMemebers();
        AdministratorPage admin = homepage.clickAdministrator();
        admin.chooseLang();

        String actual = driver.findElement(admin.membersEn).getText();
        Assert.assertTrue(actual.contains(AdministratorPage.EXPECTED_MESSAGE), "Non-existing message");
    }
}
