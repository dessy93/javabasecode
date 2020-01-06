package main.java.com.sourceCode;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Clazz {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        test t = new test();
//        t.f();

        Class c = Class.forName("main.java.com.sourceCode.test");

//        Method[] ms = c.getMethods();
//        for (int i=0;i<ms.length;i++){
//            System.out.println("class===>" + ms[i]);
//        }
//        Constructor constructor = c.getConstructor();
//        test t = (test)constructor.newInstance();

        Method m = c.getDeclaredMethod("f",null);
        m.invoke(t ,null);

    }
}
