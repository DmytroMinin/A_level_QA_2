package junit;

import junit.extenssions.MyExtensions;
import junit.extenssions.UserInjectResolver;
import junit.extenssions.UserResolver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

@ExtendWith(UserInjectResolver.class)
public class FirstTest extends BaseTest{

    @BeforeEach
    public void before(){
        System.out.println("before");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll");
    }

    @FastTest
    @UserInject
    public void firstTest(List<User> user){
        System.out.println(user.get(0).getName());
        System.out.println(user.get(1).getName());
        System.out.println("firstTest");
    }

    @Test
    @Tag("noFastTest")
    @ExtendWith(MyExtensions.class)
    @FastTest
    public void secondTest(){
        System.out.println("firstTest");
    }

    @AfterEach
    @Tag("fastTest")
    public void after(){
        System.out.println("after");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll");
    }
}
