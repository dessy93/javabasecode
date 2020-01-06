package main.java.com.leetCode.toutiao.String;

public class multiply {

    public static String multiply(String num1, String num2){

        if (num1.equals("0") || num2.equals("0"))
            return "0";

        char[] a = num1.toCharArray();
        char[] b = num2.toCharArray();

        int[] n1 = new int[num1.length()];
        int[] n2 = new int[num2.length()];
        int[] result = new int[num1.length() + num2.length()];

        for (int i=0;i<num1.length();i++){
            n1[i] = a[i] - '0';
        }

        for (int i=0;i<num2.length();i++){
            n2[i] = b[i] - '0';
        }

        for (int i=0;i<n1.length;i++){
            for (int j=0;j<n2.length;j++){
                result[i+j] += n1[i]* n2[j];
            }
        }

        for (int i=result.length-1;i>0;i--){
            result[i-1] += result[i]/10;
            result[i] = result[i]%10;
        }
        String s = "";
        for (int i=0;i<result.length-1;i++){
            s += result[i];
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(multiply("9133","0"));

    }

}
