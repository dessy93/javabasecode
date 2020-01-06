package main.java.com.leetCode.toutiao.List;

public class findLengthOfLCIS {

    public static int findLengthOfLCIS(int[] nums) {
       if (nums.length ==0)
           return 0;
       int j = 0;
       int max = 1;
       int k = 1;

       while(j +1 <nums.length){
           if (nums[j] < nums[j+1]){
               k++;
               j++;
               if (j+1 == nums.length ){
                   max = Math.max(k,max);
                   break;
               }
           }else {
               ++j;
               max = Math.max(k,max);
               k = 1;
           }
       }
       return max;

    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        System.out.println(findLengthOfLCIS(nums));
    }
}
