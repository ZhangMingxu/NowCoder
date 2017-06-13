package com.zhangmingxu.moni;

import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/4/2.
 * 牛牛有两个字符串（可能包含空格）,牛牛想找出其中最长的公共连续子串,希望你能帮助他,并输出其长度。
 * 输入描述:
 * 输入为两行字符串（可能包含空格），长度均小于等于50.
 * <p>
 * <p>
 * 输出描述:
 * 输出为一个整数，表示最长公共连续子串的长度。
 * <p>
 * 输入例子:
 * abcde
 * abgde
 * <p>
 * 输出例子:
 * 2
 */
public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            char[] a = scanner.nextLine().toCharArray();
            char[] b = scanner.nextLine().toCharArray();
            int[][] dp = new int[a.length + 1][b.length + 1];
            int result = 0;

            for (int i = 0; i < a.length + 1; i++) {
                for (int j = 0; j < b.length + 1; j++) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 0;
                    } else if (a[i - 1] == b[j - 1]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        result = Math.max(result, dp[i][j]);
                    } else {
                        dp[i][j] = 0;
                    }
                }
            }
            System.out.println(result);
        }
    }
}
