package com.designPattern.Prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('-');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('@');
        manager.register("underlinePen",underlinePen);
        manager.register("messageBox1",messageBox1);
        manager.register("messageBox2",messageBox2);

        manager.create("underlinePen").use("ccc");
        manager.create("messageBox1").use("xxx");
        manager.create("messageBox2").use("yyy");
    }

 }
