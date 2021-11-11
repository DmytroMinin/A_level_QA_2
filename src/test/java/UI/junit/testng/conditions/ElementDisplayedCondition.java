package UI.junit.testng.conditions;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class ElementDisplayedCondition implements ExpectedCondition<Boolean> {
    WebElement element;
    @NullableDecl
    @Override
    public Boolean apply(@NullableDecl WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/div/form/div/div/input")).isDisplayed();
    }
}
