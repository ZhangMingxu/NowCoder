package com.zhangmingxu.moni;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/5/19.
 * 思路是这样的 先排序
 * 比如排完序 1 2 3 4 5 6 7 8 9 这九个数
 * 组队思路是这样的 第一个最后两个 1 8 9
 * 剩下 2 3 4 5 6 7
 * 第一个最后两个                 2 6 7
 * 剩下                           3 4 5
 * 就是第一个和最后两个 再把已经组队的删掉 然后在循环 第一个最后两个
 * 那么中位数可以看到是 8 6 4
 * 找到中位数在整个排序后的素组和下标的规则是 data[data.length-(2*(i+1))]
 * 再加在一起
 */
public class ZuDuiJingSai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        long[] data;
        while(scanner.hasNext()){
            n=scanner.nextInt();
            data = new long[3*n];
            for (int i = 0; i <data.length ; i++) {
                data[i] = scanner.nextLong();
            }
            Arrays.sort(data);
            long result = 0;
            for (int i = 0; i < n; i++) {
                result+=data[data.length-(2*(i+1))];
            }
            System.out.println(result);
        }
    }
}
