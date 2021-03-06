package UI.junit.testng.locators;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class SelenidePage {
    static By input = By.xpath("asdas");
    static By password = By.id("pass");
    static By inputButton = By.id("id");

    public static WebElement logIn(String login, String pass){
        Configuration.timeout = 100;
        $(input).should(Condition.visible).sendKeys(login);
        $(password).sendKeys(pass);
        $(inputButton).submit();
        return $(input);
    }


}
