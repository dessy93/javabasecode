package com.designPattern.Adapter;

public class Banner {
    private String word;

    public Banner(String word){
        this.word = word;
    }

    public void showWithParen(){
        System.out.println("(" + word + ")");
    }

    public void showWithAster(){
        System.out.println("*" + word + "*");
    }
}
