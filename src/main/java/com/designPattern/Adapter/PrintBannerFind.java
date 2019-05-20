package com.designPattern.Adapter;

public class PrintBannerFind extends PrintFind {

    private Banner banner;

    public PrintBannerFind(String banner) {
        this.banner = new Banner(banner);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
