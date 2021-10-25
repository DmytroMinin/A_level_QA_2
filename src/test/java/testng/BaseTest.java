package testng;

import testng.locators.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileNotFoundException;

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
