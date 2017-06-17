package com.zhangmingxu.moni;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/6/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i]=scanner.nextInt();
        }
        if (n==2){
            System.out.println(Math.abs(h[0]-h[1]));
            return;
        }
        int[] help = new int[n];
        Arrays.sort(h);
        int index = n/2-1;
        for (int i = 1; i < n; i+=2) {
            help[index--] = h[i];
        }

        help[n/2]=h[0];
        index = n/2+1;
        for (int i = 2; i < n; i+=2) {
            help[index++] = h[i];
        }
        int max = Math.abs(help[0]-help[n-1]);
        for (int i = 0; i < n-1; i++) {
            if(max<Math.abs(help[i]-help[i+1])){
                max = Math.abs(help[i]-help[i+1]);
            }
        }
        System.out.println(max);


    }
//    private static long sum(int n,int k){
//        long sum = 0;
//        for (int i = 0; i < k; i++) {
//            sum+=n--;
//        }
//        return sum;
//    }
//    private static long count(int n,int k,int sum){
//        int[][] dp = new int[n+1][sum+1];
//        int[] items = new int[n];
//        for (int i = 0; i < n; i++) {
//            items[i]=i;
//        }
//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                dp[i][j]=-2;
//            }
//        }
//        dp[0][0]=-1;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= sum ; j++) {
//                if (dp[i][j]==-2){
//                    continue;
//                }
//                for (int k = dp[i][j]+1; k < n; k++) {
//
//                }
//
//            }
//
//        }
//    }
}
