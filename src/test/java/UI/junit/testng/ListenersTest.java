package UI.junit.testng;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({MyTestListener.class, MyListener.class, MyGroupListener.class})
public class ListenersTest{
    ITestContext context;

    @Test
    public void firstSeleniumTest() {
        System.out.println("TEST ---------");
        Assert.fail();
    }
}
