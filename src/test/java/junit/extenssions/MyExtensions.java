package junit.extenssions;

import org.junit.jupiter.api.extension.*;

public class MyExtensions implements AfterEachCallback, AfterAllCallback, BeforeAllCallback, BeforeTestExecutionCallback {
    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("beforeAllCallback");
    }

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        context.getTags().stream().filter(s -> s.equals("")).forEach(System.out::println);
        System.out.println("beforeTestExecution - > " + context.getTestMethod().orElseThrow());
    }

    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("AfterALlCallback");
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("AfterEachCallback -> " + extensionContext.getRequiredTestMethod().getName());
    }
}
