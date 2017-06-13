package com.zhangmingxu.baidu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/5/11.
 * 度度熊有一个N个数的数组，他想将数组从大到小排好序，但是萌萌的度度熊只会下面这个操作：
 * 任取数组中的一个数然后将它放置在数组的最后一个位置。
 * 问最少操作多少次可以使得数组从小到大有序？
 * 输入描述:
 * 首先输入一个正整数N，接下来的一行输入N个整数。(N <= 50, 每个数的绝对值小于等于1000)
 * <p>
 * <p>
 * 输出描述:
 * 输出一个整数表示最少的操作次数。
 * <p>
 * 输入例子:
 * 4
 * 19 7 8 25
 * <p>
 * 输出例子:
 * 2
 *
 * 思路：
 * 复杂度 nlogn 但是需要一个 n 的辅助数组
 * 用一个辅助数组对所有元素进行排序，从小到大排序
 * 从第一个排好序的元素开始，即最小的元素开始与没排好序数组元素比较，
 * 检查有多少个已经是从最小到大好序的，位置可以不连续，但是大的元素必须在小的元素后面，
 *  统计出一共有 count个，这些元素是不需要移动的元素
 *  一共有 n 个元素，所以需要移动 n - count 次
 *
 */
public class YouQuDePaiXu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        int[] data;
        int [] sortdata;
        int count = 0;
        while (scanner.hasNext()) {
            N = scanner.nextInt();
            data = new int[N];
            sortdata = new int[N];
            for (int i = 0; i < N; i++) {
                data[i] = scanner.nextInt();
                sortdata[i] = data[i];
            }
            Arrays.sort(sortdata);
            int j = 0;
            for (int i = 0; i < N; i++) {
                if (data[i]==sortdata[j]){
                    count++;
                    j++;
                }
            }
            System.out.println(N-count);
        }
    }
}
