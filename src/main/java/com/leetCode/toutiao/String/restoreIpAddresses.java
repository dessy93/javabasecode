package main.java.com.leetCode.toutiao.String;

import java.util.ArrayList;
import java.util.List;

public class restoreIpAddresses {

    public static List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        find(s,4,"",list);
        return list;
    }

    public static void find(String s ,int k,String out,List<String> list){
        if (k == 0){
            if (s.isEmpty())
                list.add(out);
        }else {
            for (int i=1;i<=3;i++){
                if (s.length() >= i && isValid(s.substring(0,i))){
                    if (k == 1)
                        find(s.substring(i,s.length()),k-1,out + s.substring(0,i),list);
                    else
                        find(s.substring(i,s.length()),k-1,out + s.substring(0,i) + ".",list);
                }
            }
        }
    }

    public static boolean isValid(String s){
        int k =Integer.valueOf(s);
        if (s.isEmpty() || s.length() >3 || k <0 || k>255 || (s.length() > 1 && s.charAt(0) == '0'))
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("25525511135"));
    }

}
