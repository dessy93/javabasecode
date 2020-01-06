package com.designPattern.Adapter;

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String word) {
        super(word);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
