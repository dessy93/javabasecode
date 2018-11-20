package com.designPattern.Prototype;

import java.util.HashMap;

public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name,Product proto){
        showcase.put(name,proto);
    }

    public Product create(String protoname) throws CloneNotSupportedException {
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
