package com.designPattern.AbstractFactory;

public abstract class Factory {

    public static Factory getFactory(String classname) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Factory factory = null;

        factory = (Factory)Class.forName(classname).newInstance();

        return factory;
    }

    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);
}
