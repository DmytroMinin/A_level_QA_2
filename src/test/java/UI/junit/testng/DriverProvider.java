package UI.junit.testng;

import org.openqa.selenium.WebDriver;

public class DriverProvider {
    volatile WebDriver driver;

    public synchronized WebDriver getDriver(){
        return driver;
    }
}
