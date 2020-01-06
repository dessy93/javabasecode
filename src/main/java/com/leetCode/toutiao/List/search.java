package main.java.com.leetCode.toutiao.List;

public class search {

    public static int search(int[] nums, int target) {
        int i=0,j=nums.length;
        int num = -1;
        if (nums.length == 0)
            return num;

        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return num;
            }
        }

        while (i<nums.length && nums[i] <= target){
            num++;
            if (nums[i] == target) {
                i++;
                return num;
            }
            else
                i++;
        }

        while (j>0 && nums[j-1] >= target){
                num++;
            if (nums[j-1] == target){
                j--;
                return nums.length - num-1;
            }
            else
                j--;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3};

        System.out.println(search(nums,3));
    }
}
