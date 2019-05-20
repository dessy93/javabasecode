package main.java.com.sourceCode;

import java.io.BufferedInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class test {


    public void f(){
        System.out.println("hello");
    }

    public static void main(String[] args) {

        //适配器模式
        //https://www.cnblogs.com/hoobey/p/6661294.html
       int[] list = {1,2,3};
        Arrays.asList(list);


        //组合设计模式
        Map map = new HashMap();

        //装饰者设计模式
        //https://www.cnblogs.com/lzb1096101803/p/4425483.html
        InputStream i = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
        InputStream inputStream = new BufferedInputStream(i);

        //享元模式
        //https://blog.csdn.net/dawn_after_dark/article/details/74154338
        Integer.valueOf(1);
    }
}
