package testng;

import com.codeborne.selenide.*;
import testng.driverproviders.MyDriver;
import testng.locators.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static testng.locators.SelenidePage.logIn;

public class SelenideTest {

    @Test
    public void testSelenide(){
        Configuration.browser = "edge";
        Configuration.timeout = 100;
        Configuration.headless = false;
        open("https://www.google.com/");
        SelenideElement element = $(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
                .should(Condition.cssValue("sada", "sda")).shouldNot(Condition.checked)
                .$("Asdas");
        element.lastChild().should(Condition.visible);
        element.is(Condition.disappear);
        var page = page(BasePage.class);
        Configuration.browser = MyDriver.class.getName();
        var driver =  new SelenideDriver(new SelenideConfig());
        var seleniodeElements = $$(By.id("sdasd"));
        logIn("sad", "Asdas");
    }
}
