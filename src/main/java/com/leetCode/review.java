package com.leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class review {
    public static int f1(String s){
        HashSet<Character> hashSet = new HashSet<>();
        int result =0,i=0,j=0;
        while (i<s.length() && j<s.length()){
            if (!hashSet.contains(s.charAt(j))){
                hashSet.add(s.charAt(j));
                j++;
                result = (j - i) > result ? (j - i) :result;
            }else {
                hashSet.remove(s.charAt(i));
                i++;
            }
        }

        return result;
    }

    public static String simplifyPath(String path){
        String[] s = path.split("/");
        String r = "/";
        for (int i=0;i<s.length;i++){
            if (s[i].equals("/") || s[i].equals(".") || s[i].equals(""))
                continue;
            else {
                if (s[i] .equals("..")){
                    if (r.length() == 1){
                        continue;
                    }else {
                        int l = r.length()-2;
                        while (l-- > 0){
                            if (r.charAt(l) == '/')
                                break;
                        }
                        r = r.substring(0,l+1);
                    }
                }else {
                     r += s[i] + "/";
                }
            }
        }

        if (r.length() > 1){
            r = r.substring(0,r.length()-1);
        }

        return r;
    }

    public static List<String> restoreIpAddresses(String s){
        List<String> list = new ArrayList<>();
        find(s,4,"",list);
        return list;
    }

    public static void find(String s,int k,String out,List<String> list){
        if (k == 0){
            if (s.isEmpty())
                list.add(out);

        }else {
            for (int i=1;i<=3;i++){
                if (s.length()>=i && isValid(s.substring(0,i))){
                    if (k == 1){
                        find(s.substring(i,s.length()),k-1,out+s.substring(0,i),list);
                    }else {
                        find(s.substring(i,s.length()),k-1,out+s.substring(0,i)+'.',list);
                    }
                }
            }
        }

    }

    public static boolean isValid(String s){
        int k = Integer.valueOf(s);
        if (s.isEmpty() || s.length()>3 || k<0 || k>255 || (s.length()>=2 && s.charAt(0)=='0')){
            return false;
        }
        return true;
    }

    public static int search(int[] nums, int target) {
        int i,j,num=-1;
        if (nums.length == 0)
            return -1;
        if (nums.length == 1){
            if (nums[0] == target)
                return 0;
            else
                return -1;
        }
        i=0;
        while (i < nums.length && nums[i] <= target){
            num++;
            if (nums[i] == target)
                return num;
            else
                i++;
        }
        j=nums.length -1;
        while (j > 0 && nums[j] >= target){
            num++;
            if (nums[j] == target)
                return nums.length -1 - num;
            else
                j--;
        }

        return -1;

    }

    public static void main(String[] args) {
       // System.out.println(f1("ccxycxy77"));
       // System.out.println(simplifyPath("/a/b/../"));
       // System.out.println(restoreIpAddresses("25525511135"));
        int[] nums = {4,5,6,7,8,0,1,2,3};
        System.out.println(search(nums,0));

    }
}
