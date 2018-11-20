package com.designPattern.Builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.makeTile("标题");
        builder.makeString("早上");
        builder.makeItem(new String[]{"早上，下午"});
        builder.makeString("晚上");
        builder.makeItem(new String[]{"下午，晚上"});
        builder.close();
    }
}
