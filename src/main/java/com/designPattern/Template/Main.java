package com.designPattern.Template;

public class Main {

    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisPlay("Hello world");
        AbstractDisplay d3 = new StringDisPlay("你好 世界");

        d1.display();
        d2.display();
        d3.display();
    }
}
