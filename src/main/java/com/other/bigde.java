package com.other;

import java.math.BigDecimal;

public class bigde {

    public static void main(String[] args) {
        BigDecimal point = new BigDecimal("45.1");
        System.out.println(BigDecimal.ZERO.compareTo(point.remainder(new BigDecimal(15))));
    }
}
