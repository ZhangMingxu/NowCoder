package com.zhangmingxu.baidu;

import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/5/18.
 * 题目描述
 * C市现在要转移一批罪犯到D市，C市有n名罪犯，按照入狱时间有顺序，另外每个罪犯有一个罪行值，值越大罪越重。
 * 现在为了方便管理，市长决定转移入狱时间连续的c名犯人，同时要求转移犯人的罪行值之和不超过t，问有多少种选择的方式？
 * <p>
 * 输入描述:
 * 第一行数据三个整数:n，t，c(1≤n≤2e5,0≤t≤1e9,1≤c≤n)，第二行按入狱时间给出每个犯人的罪行值ai(0≤ai≤1e9)
 * <p>
 * <p>
 * 输出描述:
 * 一行输出答案。
 * <p>
 * 输入例子:
 * 3 100 2
 * 1 2 3
 * <p>
 * 输出例子:
 * 2
 */
public class FanZuiZhuanYi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int t = 0;
        int c = 0;
        int[] data;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            t = scanner.nextInt();
            c = scanner.nextInt();
            data = new int[n];
            for (int i = 0; i < n; i++) {
                data[i] = scanner.nextInt();
            }
            int sum = 0;
            int count = 0;
            for (int i = 0; i < c; i++) {
                sum += data[i];
            }
            if (sum <= t) {
                count++;
            }
            for (int i = c; i < data.length; i++) {
                sum = sum+data[i]-data[i-c];
                if (sum <= t) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
