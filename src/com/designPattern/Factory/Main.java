package com.designPattern.Factory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("1");
        Product card2 = factory.create("2");
        card1.use();
        card2.use();

    }
}
