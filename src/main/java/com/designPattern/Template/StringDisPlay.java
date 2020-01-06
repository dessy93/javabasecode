package com.designPattern.Template;

public class StringDisPlay extends AbstractDisplay {

    private String string;

    public StringDisPlay(String string) {
        this.string = string;
    }

    @Override
    public void open() {
        System.out.println("[[");
    }

    @Override
    public void print() {
        System.out.println(string);
    }

    @Override
    public void close() {
        System.out.println("]]");
    }
}
