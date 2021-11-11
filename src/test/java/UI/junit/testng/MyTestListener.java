package UI.junit.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.time.LocalDate;
import java.util.Arrays;

public class MyTestListener implements ITestListener {
    private Integer status;
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName());
        System.out.println("Test started time -> "+ LocalDate.now());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Success with result " + result.getStatus());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        result.setStatus(1);
        System.out.println("Test Failed with result " + result.getStatus());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        if(status==1){
            System.out.println("Start another suite");
        }
        ITestNGMethod method = Arrays.stream(context.getAllTestMethods()).filter(s -> s.getMethodName().equals("SignInTest")).findFirst().orElseThrow();
        method.getDescription();
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println(context.getAllTestMethods().length);
        System.out.println("Test Finished time -> "+ LocalDate.now());
    }
}
