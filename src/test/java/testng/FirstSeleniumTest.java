package testng;

import junit.User;
import org.testng.annotations.*;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

public class FirstSeleniumTest extends BaseTest{
    WebDriverWait waiter;

    @BeforeClass
    public void before(){
        driver.get("https://rozetka.com.ua/");
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.get("balbla");
        waiter = new WebDriverWait(driver, 10);
        waiter.until(new ExpectedCondition<Boolean>() {
            @NullableDecl
            @Override
            public Boolean apply(@NullableDecl WebDriver driver) {
                return driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/div/form/div/div/input")).isDisplayed();
            }
        });
        waiter.until(new ExpectedCondition<Boolean>() {
            @NullableDecl
            @Override
            public Boolean apply(@NullableDecl WebDriver driver) {
                return driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/div/form/div/div/input")).isDisplayed();
            }
        });
    }

    @AfterMethod
    public void afterMethod(){
        driver.getCurrentUrl().equals("Asda");
    }

    @Test
    public void firstSeleniumTest() {
        var inputField = waiter.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/div/form/div/div/input")));
        //WebElement inputField = driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/div/form/div/div/input"));
        inputField.sendKeys("nixsolutions");
        inputField.submit();
        List<WebElement> imagesList = driver.findElements(By.tagName("img"));
        System.out.println(imagesList.size());
        inputField.getText();
    }

    public WebElement findAndCLickElementById(WebDriver driver, String id) {
        return driver.findElement(By.id(id));
    }
}
