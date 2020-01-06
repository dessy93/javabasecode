package com.designPattern.Bridge;

public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times){
        opne();
        for (int i=0;i<times;i++){
            print();
        }
        close();
    }
}
