package UI.junit.patterns;

import UI.junit.User;
import UI.junit.UserInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        proxy();
    }

    public static void proxy(){
        UserInterface user = (UserInterface) Proxy.newProxyInstance(User.class.getClassLoader(), User.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("connect")){
                System.out.println("bla bla bla");
                method.invoke(proxy, args);
                System.out.println("BLA BLA BLA");
                }
                if(method.getName().equals("privet")){
                    System.out.println(args);
                    method.setAccessible(true);
                    method.setAccessible(false);
                    System.out.println("222222");
                }
                return proxy;
            }
        });
        user.privet();
    }
}
