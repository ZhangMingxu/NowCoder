package com.zhangmingxu.jianzhioffer;

import java.util.Arrays;

/**
 * Created by 张明旭 on 2017/5/11.
 */
public class Find {
    public boolean find(int target, int[][] array) {
        boolean result = false;

        try {
            if (target < array[0][0] || target > array[array.length - 1][array[0].length - 1]) {

            } else {
                for (int i = 0; i < array.length; i++) {
                    if (Arrays.binarySearch(array[i], target) >= 0) {
                        result = true;
                        break;
                    }
                }

            }
            return result;
        } catch (Exception e) {
            return false;
        }
    }
    public static void main(String[] args) {
        //int[][]data = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int[][] data = new int[1][];
        System.out.println(new Find().find(1, data));
    }

}
