package main.java.com.leetCode.toutiao.String;

public class longestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String commonResult = "";
        int index = 0;

        if (strs.length == 0)
            return commonResult;
        if (strs.length == 1)
            return strs[0];

       while (true){
           for (int i=0;i<strs.length -1;i++){
               if (index == strs[i].length() || index == strs[i+1].length() || strs[i].length() ==0 || strs[i+1].length() ==0){
                   return commonResult;
               }
               if (strs[i].charAt(index) != strs[i+1].charAt(index)){
                   return commonResult;
               }
           }
           commonResult += strs[0].charAt(index++);
       }

    }

    public static void main(String[] args) {
        String[] strings = {"ffff","ff","f"};
        System.out.println("is:" + longestCommonPrefix(strings));
    }
}
