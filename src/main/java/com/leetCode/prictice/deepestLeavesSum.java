package com.leetCode.prictice;

import java.util.LinkedList;
import java.util.List;

public class deepestLeavesSum {

      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public static void bfs(TreeNode root, LinkedList<List<Integer>> list, int level){
          if (root == null)
              return ;
          if (list.size() < level){
              List<Integer> subList = new LinkedList<>();
              list.add(subList);
          }

          list.get(level-1).add(root.val);
          if (root.left != null) bfs(root.left,list,level+1);
          if (root.right != null) bfs(root.right,list,level+1);

    }

    public static int deepestLeavesSum(TreeNode root) {
        int sum=0;
        LinkedList<List<Integer>> result = new LinkedList<>();
        bfs(root,result,1);
        if (result.get(result.size() -1).size() > 0){
            for (Integer i : result.get(result.size() -1)){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        System.out.println(deepestLeavesSum(treeNode1));
    }


}
