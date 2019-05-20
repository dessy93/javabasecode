package main.java.com.leetCode.toutiao.List;

public class maxAreaOfIsland {

    public static int maxAreaOfIsland(int[][] grid) {
        int h = grid.length;
        int w = grid[0].length;
        int[][] flag = new int[h][w];

        for (int i=0;i<h;i++) {
            for (int j = 0; j < w; j++) {
                flag[i][j] = 0;
            }
        }

        int max = 0;
        for (int i=0;i<h;i++){
            for (int j=0;j<w;j++){
                if (grid[i][j] == 1 && flag[i][j] == 0)
                    max = Math.max(max,find(grid,flag,i,j));
            }
        }

        return max;
    }

    public static int find(int[][] grid,int[][] flag,int i,int j){
        int num = 0;

        //递归边界
        if (flag[i][j] == 1 || grid[i][j] ==0)
            return 0;

        flag[i][j] = 1;
        num++;

        //up
        if (i -1 >=0 ){

            num+=find(grid,flag, i-1, j);
        }
        //down
        if (i +1 < grid.length ){

            num+=find(grid, flag,i+1, j);
        }
        //left
        if (j -1 >=0 ){

            num+=find(grid,flag, i, j-1);
        }
        //right
        if (j +1 <grid[0].length){

            num+=find(grid,flag, i, j+1);
        }

        //递归向上层返回
        return num;
    }

    public static void main(String[] args) {
        int[][] a = {{1,1,0,0,1,0,0,0},
                     {1,1,0,1,1,1,0,0},
                     {1,1,0,0,1,0,0,0}};
        System.out.println(maxAreaOfIsland(a));
    }

}
