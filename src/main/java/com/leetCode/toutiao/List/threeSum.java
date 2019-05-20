package main.java.com.leetCode.toutiao.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class threeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> totalList = new ArrayList<>();
        Arrays.sort(nums);
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        int zeroStart = -1;
        int zeroEnd = nums.length;
        HashSet<String> isExist = new HashSet<>();
        boolean zeroFlag = false;
        //将正数和负数分别放入hashset中，比计算出对于下标
        for (int i=0;i<nums.length;i++){
            if (nums[i] == 0)
                zeroFlag = true;

            if (nums[i] <0)
                zeroStart = i;
            if (zeroEnd == nums.length && nums[i]>0)
                zeroEnd = i;
            if (nums[i] > 0)
                hashSet1.add(nums[i]);
            if (nums[i] < 0)
                hashSet2.add(nums[i]);
        }

        //判断 0,0,0这种情况
        if ((zeroEnd - zeroStart) >= 4 && zeroFlag){
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(0);
            list.add(0);
            totalList.add(list);
        }

        //若存在0，则考虑[-n,0,n] 这种情况
        if (zeroFlag){
            for (Integer i :hashSet1){
                if (hashSet2.contains(i*(-1))){
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(0);
                    list.add(i*(-1));
                    totalList.add(list);
                }
            }
        }

        //若不存在0,则考虑[-a1,-b1,c1],[-a2,b2,c2]这两种情况
             for (int i=0;i<zeroStart;i++) {
                for (int j = i + 1; j <= zeroStart; j++) {
                    if (hashSet1.contains((nums[i] + nums[j]) * -1)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add((nums[i] + nums[j]) * (-1));

                        if (!isExist.contains(nums[i]+"," +nums[j] +","+ (nums[i] + nums[j]) * (-1))){
                            totalList.add(list);
                            isExist.add(nums[i]+"," +nums[j] +","+ (nums[i] + nums[j]) * (-1));
                        }
                    }
                }
            }

            for (int i=zeroEnd;i<nums.length-1;i++){
                for (int j = i+1;j<nums.length;j++){
                    if (hashSet2.contains((nums[i] + nums[j]) * -1)){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add((nums[i] + nums[j]) * (-1));

                        if (!isExist.contains(nums[i]+"," +nums[j] +","+ (nums[i] + nums[j]) * (-1))){
                            totalList.add(list);
                            isExist.add(nums[i]+"," +nums[j] +","+ (nums[i] + nums[j]) * (-1));
                        }

                    }
                }
            }

            return totalList;
        }

    public static void main(String[] args) {
        int[] num =  {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        System.out.println(threeSum(num));
    }


}
