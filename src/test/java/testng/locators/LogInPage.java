package testng.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


public class LogInPage extends BasePage{
    @FindBy(xpath = "login_input")
    private WebElement input;
    @FindBy(xpath = "password_input")
    private WebElement password;
    @FindBy(xpath = "input")
    private WebElement inputButton;

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public MainPage logIn(String login, String password) {
        input.sendKeys(login);
        this.password.sendKeys(password);
        inputButton.submit();
        var pageTitle = driver.getTitle();
        //Assertions.assertEquals("MainPAge", pageTitle);
        return new MainPage();
    }

    public void openPage() {
        driver.get("https://rozetka.com.ua/");
        var pageTitle = driver.getTitle();
        //Assertions.assertEquals("LoginPAge", pageTitle);
    }

    public void ReflectionExample() throws NoSuchFieldException, IllegalAccessException {
        var fields = LogInPage.class.getDeclaredFields();
        for (Field field : fields)
            for (Annotation annotation : field.getAnnotations()) {
                if (annotation.annotationType().equals(FindBy.class)){
                    var field1 = LogInPage.class.getDeclaredField("input");
                    field1.setAccessible(true);
                    field1.set(new LogInPage(driver), driver.findElement(By.xpath(annotation.toString())));
                }
            }
    }


}
