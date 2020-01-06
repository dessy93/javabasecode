package com.designPattern.Builder;

public abstract class Builder {

    public abstract void makeTile(String tile);
    public abstract void makeString(String str);
    public abstract void makeItem(String[] items);
    public abstract void close();

}
