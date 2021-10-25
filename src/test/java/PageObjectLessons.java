import locators.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageObjectLessons extends BaseTest {

    @BeforeMethod(groups = "fllItem")
    public void fillItems(){
    }

    @Test(description = "privet")
    public void selectItemTest(){
        loginPage.openPage();
        loginPage.logIn("A_level", "1231");
    }

    @Test(invocationCount = 10)
    public void deleteItemFormBucketTest(){
        LogInPage logInPage = new LogInPage(driver);
        System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.logIn("A_level", "1231")
                .doSmth()
                .contains("MainPAge");
        var search = driver.findElement(By.xpath("search"));
        var category = driver.findElement(By.xpath("category"));
        var findButton = driver.findElement(By.xpath("findButton"));
        var item = driver.findElement(By.xpath("item"));
    }

    @Test(priority = 2)
    public void deleteItemFormBucketTest1(){
        System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.logIn("A_level", "1231")
                .doSmth()
                .contains("MainPAge");
        var search = driver.findElement(By.xpath("search"));
        var category = driver.findElement(By.xpath("category"));
        var findButton = driver.findElement(By.xpath("findButton"));
        var item = driver.findElement(By.xpath("item"));
    }

    @Test(groups = "fillItem")
    public void deleteItemFormBucketTest2(){
        System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.logIn("A_level", "1231")
                .doSmth()
                .contains("MainPAge");
        var search = driver.findElement(By.xpath("search"));
        var category = driver.findElement(By.xpath("category"));
        var findButton = driver.findElement(By.xpath("findButton"));
        var item = driver.findElement(By.xpath("item"));
    }
}
