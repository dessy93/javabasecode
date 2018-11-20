package com.designPattern.Builder;

public class Main {

    public static void main(String[] args) {
        TextBuild textBuild = new TextBuild();
        Director director = new Director(textBuild);
        director.construct();
        String result = textBuild.getResult();
        System.out.println(result);
    }

}
