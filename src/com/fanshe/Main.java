package com.fanshe;

public class Main {

    static <T>T f(T t,String s) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class<T> pairClass = (Class<T>)Class.forName(s);
        T pair1 = pairClass.newInstance();
        return pair1;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Pair pair = new Pair();
        pair.setA(1);
        System.out.println(pair.getA());

        String s = "com.fanshe.Pair";
        Pair pair1 = f(new Pair(),s);
        pair1.setA(2);
        System.out.println(pair1.getA());

    }
}
