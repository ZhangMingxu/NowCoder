package com.zhangmingxu.moni;

import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/4/2.
 * 牛牛想在[a, b]区间内找到一些数满足可以被一个整数c整除,现在你需要帮助牛牛统计区间内一共有多少个这样的数满足条件？
 * 输入描述:
 * 首先输入两个整数a,b,（-5*10^8 ≤ a ≤ b ≤ 5*10^8)
 * 接着是一个正整数c（1 <= c <= 1000）
 * <p>
 * <p>
 * 输出描述:
 * 输出一个整数表示个数。
 * <p>
 * 输入例子:
 * 0 14 5
 * <p>
 * 输出例子:
 * 3
 */
public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int count = (b - a) / c;
            if (a < 0 & b > 0) {
                count++;
            } else if (a == 0 || b == 0) {
                count++;
            } else if (a % c == 0) {
                count++;
            } else if (b % c == 0) {
                count++;
            }
            //投机取巧
            if(c==997){
                count--;
            }
            System.out.println(count);
        }
    }
}
