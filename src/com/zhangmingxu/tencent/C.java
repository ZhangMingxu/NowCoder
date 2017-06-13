package com.zhangmingxu.tencent;

import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/3/29.
 * 给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。如何删除才能使得回文串最长呢？
 * 输出需要删除的字符个数。
 * <p>
 * 输入描述:
 * <p>
 * 输入数据有多组，每组包含一个字符串s，且保证:1<=s.length<=1000.
 * <p>
 * <p>
 * <p>
 * 输出描述:
 * <p>
 * 对于每组数据，输出一个整数，代表最少需要删除的字符个数。
 * <p>
 * 输入例子:
 * abcda
 * google
 * <p>
 * 输出例子:
 * 2
 * 2
 * <p>
 * 已通过！！！！！！！！！！！！！
 */
public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            String restr = new StringBuilder(str).reverse().toString();
            int[][] dp = new int[str.length() + 1][restr.length() + 1];
            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < dp.length; j++) {
                    dp[i][j] = str.charAt(i - 1) == restr.charAt(j - 1) ?
                            dp[i - 1][j - 1] + 1 : Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
            System.out.println(str.length() - dp[str.length()][str.length()]);
        }

    }
}

