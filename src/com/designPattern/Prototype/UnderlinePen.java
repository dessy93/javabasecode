package com.designPattern.Prototype;

public class UnderlinePen implements Product{

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println(ulchar + " " + s + " " + ulchar);
        for (int i=0;i<length;i++){
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() throws CloneNotSupportedException {
        Product p = null;
        p = (Product)clone();
        return p;
    }
}
