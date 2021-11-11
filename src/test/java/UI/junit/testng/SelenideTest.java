package UI.junit.testng;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
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
    }
}
