import locators.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BaseTest {
    WebDriver driver;
    LogInPage loginPage;

    @BeforeClass
    public void setUp() throws FileNotFoundException {
        File file = new File("sdasdasd");
        FileReader reader = new FileReader(file);
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        LogInPage login = new LogInPage(driver);
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
