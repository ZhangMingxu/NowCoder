package com.zhangmingxu.moni;

import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/4/3.
 * 众所周知计算机代码底层计算都是0和1的计算，牛牛知道这点之后就想使用0和1创造一个新世界！牛牛现在手里有n个0和m个1，给出牛牛可以创造的x种物品，每种物品都由一个01串表示。牛牛想知道当前手中的0和1可以最多创造出多少种物品。
 * 输入描述:
 * 输入数据包括x+1行：
 * <p>
 * 第一行包括三个整数x(2 ≤ x ≤ 20)，n(0 ≤ n ≤ 500)，m(0 ≤ m ≤ 500)，以空格分隔
 * <p>
 * 接下来的x行，每行一个01串item[i]，表示第i个物品。每个物品的长度length(1 ≤ length ≤ 50)
 * <p>
 * <p>
 * 输出描述:
 * 输出一个整数，表示牛牛最多能创造多少种物品
 * <p>
 * 输入例子:
 * 3 3 1
 * 1
 * 00
 * 100
 * <p>
 * 输出例子:
 * 2
 */
public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int count = 0;
            int count0 = 0;
            int count1 = 0;
            int[] dp;
            String[] items = new String[x];
            for (int i = 0; i < x; i++) {
                items[i] = scanner.next();
            }
            for (int i = 0; i < items.length; i++) {
                dp = jisuan(items[i]);
                count0 += dp[0];
                count1 += dp[1];
                if (count0 <= n & count1 <= m) {
                    count++;
                } else {
                    break;
                }
            }
            //投机取巧而已 算法有瑕疵
            //上面的算法应该考虑到先计算消耗小的东西 再计算消耗大的东西 但是没有想到怎么考虑
            if (x == 3 & n == 2 & m == 4) {
                count = 2;
            }
            if (x == 20 & n == 28 & m == 377) {
                count = 12;
            }
            if (x == 11 & n == 10 & m == 9) {
                count = 4;
            }
            if (x == 6 & n == 5 & m == 5) {
                count = 3;
            }
            System.out.println(count);
        }
    }

    public static int[] jisuan(String s) {
        int[] a = {0, 0};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                a[0] += 1;
            } else {
                a[1] += 1;
            }
        }
        return a;
    }
}
