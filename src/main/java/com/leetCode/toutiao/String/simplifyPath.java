package main.java.com.leetCode.toutiao.String;



public class simplifyPath {

    public static String simplifyPath(String path) {

        String[] s = path.split("/");
        String k = "/";

        for (int i=0;i<s.length;i++){
            if (s[i].equals("/") || s[i].equals(".") || s[i].equals("")){
                continue;
            }else {
                if (s[i].equals("..")){
                    if (k.length() == 1){
                        continue;
                    }else {
                        int l = 0;
                        for (int j=k.length()-2 ;j>=0;j--){
                            if (k.charAt(j) == '/'){
                                l=j;
                                break;
                            }
                        }
                        k = k.substring(0,l+1);
                    }
                }else {

                   k +=s[i] + "/";
                }
            }
        }
        if (k.length() > 1)
            k = k.substring(0,k.length()-1);
        return k;
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));

    }
}
