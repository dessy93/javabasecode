package com.designPattern.DynamicProxy.CglibProxy;

import net.sf.cglib.proxy.Enhancer;

public class Main {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(ConcreteClass.class);
//        enhancer.setCallback(cglibProxy);
//        TargetInterface targetInterface = (TargetInterface)enhancer.create();
//        targetInterface.targetMethodA(1);

        //cglib可以代理未实现接口的类
        enhancer.setSuperclass(TestClass.class);
        enhancer.setCallback(cglibProxy);
        TestClass c = (TestClass)enhancer.create();
        c.f();
    }

}
