package UI.junit.extenssions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.engine.execution.AfterEachMethodAdapter;
import org.junit.jupiter.engine.execution.BeforeEachMethodAdapter;
import org.junit.jupiter.engine.extension.ExtensionRegistry;

public class SecondExtensions implements BeforeEachCallback, BeforeTestExecutionCallback, BeforeEachMethodAdapter, AfterEachMethodAdapter {

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("SECOND LISTENERS");
    }

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        context.getTags().stream().filter(s -> s.equals("")).forEach(System.out::println);
        System.out.println("SECOND LISTENERS BEFORE TEST - > " + context.getTestMethod().orElseThrow());
    }

    @Override
    public void invokeBeforeEachMethod(ExtensionContext extensionContext, ExtensionRegistry extensionRegistry) throws Throwable {

    }

    @Override
    public void invokeAfterEachMethod(ExtensionContext extensionContext, ExtensionRegistry extensionRegistry) throws Throwable {
        extensionContext.getElement().get();
    }
}
