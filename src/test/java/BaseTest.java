import locators.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BaseTest {
    WebDriver driver;
    LogInPage loginPage;
    LogInPage login;

    @BeforeClass
    public void setUp() throws FileNotFoundException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        login = new LogInPage(driver);
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
