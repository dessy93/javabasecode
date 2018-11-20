package com.designPattern.Bridge;

public class StringDislayImpl extends DisplayImpl {

    private String string;
    private int width;

    public StringDislayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine(){
        System.out.printf("+");
        for (int i=0;i<width;i++){
            System.out.printf("-");
        }
        System.out.println("+");
    }
}
