package main.java.com.leetCode.toutiao.String;


import java.util.Stack;

public class reverseWords {

    public static String reverseWords(String s) {
        String c = s.trim();
        String z = "";
        boolean flag = true;
        for (int i= c.length()-1;i>=0;i--){
            if (c.charAt(i) != ' '){
                z+=c.charAt(i);
                flag = true;
            }else {
                if (flag){
                    z+=c.charAt(i);
                    flag = false;
                }else {
                    continue;
                }
            }
        }
        c = "";
        StringBuilder t = new StringBuilder();
        for (int i=0;i<z.length();i++){
           if (z.charAt(i)!= ' '){
               t.append(z.charAt(i));
           }else{
               c+= t.reverse() + " ";
               t.setLength(0);
           }
        }

        for (int i=z.length()-1;i>=0;i--){
            if (z.charAt(i) != ' '){
                c += z.charAt(i);
            }else {
                break;
            }
        }
        return c;
    }

    public static String reverseWords1(String s){
        if (s.trim().length() == 0)
            return "";
        String c = s.trim();
        String[] t = c.split(" ");
        Stack<String> stack = new Stack<>();

        for (int i=0;i<t.length;i++){
            if (!t[i].equals(""))
                stack.add(t[i]);
        }

        c = "";
        while (!stack.isEmpty()){
            c += stack.pop() + " ";
        }

        c = c.substring(0,c.length()-1);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords1("a good   example"));
    }
}
