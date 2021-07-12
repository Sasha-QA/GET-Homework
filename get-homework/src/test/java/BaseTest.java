import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    private By popUp = By.id("E:\\webdrivers");

    public WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver",
                "E:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(KrstaricaHomepage.HOMEPAGE);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }
}
