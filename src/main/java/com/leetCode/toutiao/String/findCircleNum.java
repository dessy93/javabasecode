package main.java.com.leetCode.toutiao.String;

public class findCircleNum {

    static int tree[] = new int[300];

    public  static int findCircleNum(int[][] M) {
    int n = M[0].length;
    for (int i=0;i<n;i++){
        tree[i] = -1;
    }

    for (int i=0;i<n;i++) {
        for (int j = 0; j < n; j++) {
            if (M[i][j] == 1) {
                int aRoot = findRoot(i);
                int bRoot = findRoot(j);
                if (aRoot != bRoot) {
                    tree[aRoot] = bRoot;
                }
            }
        }
    }

    int ans = 0;
    for(int i = 0; i < n; i++){
        if(tree[i] == -1){
            ans++;
        }
    }
        return ans;

    }

    public  static int findRoot(int x){

        if (tree[x] == -1)
            return x;
        else {
            int tmp = findRoot(tree[x]);
            tree[x] = tmp;
            return tmp;
        }
    }

    public static void main(String[] args) {
        int[][] M = {{1,1,0},{1,1,0},{0,0,1}};

        System.out.println(findCircleNum(M));
    }
}
