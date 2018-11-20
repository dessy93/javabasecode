package com.designPattern.Bridge;

public class Main {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDislayImpl("hello china"));
        Display d2 = new CountDisplay(new StringDislayImpl("hello world"));
        CountDisplay d3 = new CountDisplay(new StringDislayImpl("hello world"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);

    }
}
