package UI.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    public static void beforeAllIf(){
        System.out.println("beforeAllIf");
    }

    @AfterAll
    public static void afterAllIf(){
        System.out.println("afterAllIf");
    }
}
