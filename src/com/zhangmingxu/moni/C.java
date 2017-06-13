package com.zhangmingxu.moni;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/4/3.
 * 牛牛手里有N根木棒,分别编号为1~N,现在他从N根里想取出三根木棒，使得三根木棒构成一个三角形,你能计算出牛牛有多少种取法吗?(考虑两种取法中使用的木棒编号有一个不一样就认为是不同的取法)。
 * 输入描述:
 * 首先输入一个正整数N，接下来的一行共有N个正整数表示每个木棒的长度。
 * <p>
 * N ≤ 50, 木棒的长度 ≤ 10000.
 * <p>
 * <p>
 * 输出描述:
 * 输出一个整数表示方法数。
 * <p>
 * 输入例子:
 * 5
 * 1 2 3 4 5
 * <p>
 * 输出例子:
 * 3
 */
public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N = scanner.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            int he = 0;
            int cha = 0;
            int count = 0;
            for (int i = 0; i < N - 2; i++) {
                for (int j = i + 1; j < N - 1; j++) {
                    he = a[i] + a[j];
                    cha = a[j] - a[i];
                    for (int k = j + 1; k < N; k++) {
                        if (a[k] < he & a[k] > cha) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
