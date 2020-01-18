package com.leetCode;

import java.util.ArrayList;
import java.util.List;

public class generate {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows == 0)
            return lists;
        lists.add(new ArrayList<>());
        lists.get(0).add(1);

        for (int i=1;i<numRows;i++){
            List<Integer> rows = new ArrayList<>();
            List<Integer> pre = lists.get(i-1);
            rows.add(1);
            for (int j=1;j<i;j++){
                rows.add(pre.get(j-1) + pre.get(j));
            }
            rows.add(1);
        lists.add(rows);
        }
        return lists;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }


}
