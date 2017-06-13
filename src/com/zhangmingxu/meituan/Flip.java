package com.zhangmingxu.meituan;



/**
 * Created by 张明旭 on 2017/5/23.
 * <p>
 * 题目描述
 * 在4x4的棋盘上摆满了黑白棋子，黑白两色的位置和数目随机其中左上角坐标为(1,1),右下角坐标为(4,4),现在依次有一些翻转操作，
 * 要对一些给定支点坐标为中心的上下左右四个棋子的颜色进行翻转，请计算出翻转后的棋盘颜色。
 * 给定两个数组A和f,分别为初始棋盘和翻转位置。其中翻转位置共有3个。请返回翻转后的棋盘。
 * 测试样例：
 * [[0,0,1,1],[1,0,1,0],[1,0,1,0],[0,0,1,0]],[[2,2],[3,3],[4,4]]
 * 返回：[[0,1,1,1],[0,0,1,0],[0,1,1,0],[0,0,1,0]]
 */
public class Flip {
    //A[][]=A[][]==0?1:0;
    public int[][] flipChess(int[][] A, int[][] f) {
        // write code here
        for (int i = 0; i < f.length; i++) {
            int x = f[i][0]-1;
            int y = f[i][1]-1;
            if (x==0&y==0){
                A[x+1][y]=A[x+1][y]==0?1:0;
                A[x][y+1]=A[x][y+1]==0?1:0;
            }else if (((x==0)&(y==1))||((x==0)&(y==2))){
                A[x][y-1]=A[x][y-1]==0?1:0;
                A[x+1][y]=A[x+1][y]==0?1:0;
                A[x][y+1]=A[x][y+1]==0?1:0;
            }else if (x==0&y==3){
                A[x][y-1]=A[x][y-1]==0?1:0;
                A[x+1][y]=A[x+1][y]==0?1:0;
            }else if (((x==1)&(y==3))||((x==2)&(y==3))){
                A[x-1][y]=A[x-1][y]==0?1:0;
                A[x][y-1]=A[x][y-1]==0?1:0;
                A[x+1][y]=A[x+1][y]==0?1:0;
            }else if (x==3&y==3){
                A[x-1][y]=A[x-1][y]==0?1:0;
                A[x][y-1]=A[x][y-1]==0?1:0;
            }else if (((x==3)&(y==1))||((x==3)&(y==2))){
                A[x][y-1]=A[x][y-1]==0?1:0;
                A[x-1][y]=A[x-1][y]==0?1:0;
                A[x][y+1]=A[x][y+1]==0?1:0;
            }else if (x==3&y==0){
                A[x-1][y]=A[x-1][y]==0?1:0;
                A[x][y+1]=A[x][y+1]==0?1:0;
            }else if (((x==1)&(y==0))||((x==2)&(y==0))){
                A[x-1][y]=A[x-1][y]==0?1:0;
                A[x][y+1]=A[x][y+1]==0?1:0;
                A[x+1][y]=A[x+1][y]==0?1:0;
            }else {
                A[x-1][y]=A[x-1][y]==0?1:0;
                A[x][y-1]=A[x][y-1]==0?1:0;
                A[x+1][y]=A[x+1][y]==0?1:0;
                A[x][y+1]=A[x][y+1]==0?1:0;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        int [][]A = {{0,1,0,0},{1,0,1,0},{1,1,0,0},{1,0,0,1}};
        int [][]f = {{2,3},{4,2},{2,3}};
        int [][]result = new Flip().flipChess(A,f);
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j <result[0].length ; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
