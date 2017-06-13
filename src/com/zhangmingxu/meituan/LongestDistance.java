package com.zhangmingxu.meituan;

/**
 * Created by 张明旭 on 2017/5/9.
 */
public class LongestDistance {
    public int getDis(int[] A, int n) {
        // write code here
        /*
         *  int dis = 0;
            if (n > 1) {
                int min = A[0];
                for (int i = 1; i < n; i++) {
                    if (A[i] - min > dis) {
                    dis = A[i] - min;
                }
             if (min > A[i]) {
                min = A[i];
             }
            }
         }
         return dis;
         */

        int result = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (A[i] - A[j] > result) {
                    result = A[i] - A[j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {10, 5};
        LongestDistance longestDistance = new LongestDistance();
        System.out.println(longestDistance.getDis(A, 2));

    }
}
