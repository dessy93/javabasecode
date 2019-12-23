package com.leetCode.toutiao.listAndTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimumTotal {

    public static int minimumTotal(List<List<Integer>> triangle) {

        for (int i=triangle.size()-2;i >=0;i--){
            for (int j=0;j<triangle.get(i).size();j++){
                triangle.get(i).set(j,triangle.get(i).get(j)+ Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1))) ;
            }

        }
        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {
//        List<Integer> list1 = Arrays.asList(2);
//        List<Integer> list2 = Arrays.asList(3,4);
//        List<Integer> list3 = Arrays.asList(6,5,7);
//        List<Integer> list4 = Arrays.asList(4,1,8,3);
//
//        List<List<Integer>> triangle = new ArrayList<>();
//        triangle.add(list1);
//        triangle.add(list2);
//        triangle.add(list3);
//        triangle.add(list4);
//
//        System.out.println(minimumTotal(triangle));

        int[] a = {1,2,3};
        List l = Arrays.asList(a);
        System.out.println(l.get(0));

    }
}
