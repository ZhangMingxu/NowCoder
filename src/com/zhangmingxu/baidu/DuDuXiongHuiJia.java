package com.zhangmingxu.baidu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/5/10.
 * 一个数轴上共有N个点，第一个点的坐标是度度熊现在位置，第N-1个点是度度熊的家。现在他需要依次的从0号坐标走到N-1号坐标。
 * 但是除了0号坐标和N-1号坐标，他可以在其余的N-2个坐标中选出一个点，并直接将这个点忽略掉，问度度熊回家至少走多少距离？
 * 输入描述:
 * 输入一个正整数N, N <= 50。
 * <p>
 * 接下来N个整数表示坐标，正数表示X轴的正方向，负数表示X轴的负方向。绝对值小于等于100
 * <p>
 * <p>
 * 输出描述:
 * 输出一个整数表示度度熊最少需要走的距离。
 * <p>
 * 输入例子:
 * 4
 * 1 4 -1 3
 * <p>
 * 输出例子:
 * 4
 * 未通过 大神解法
 * 循环遍历数组 判断第 i 个点加入的距离（positions[i]-positions[i-1])+Math.abs(positions[i+1]-positions[i]）
 * 和第 i 个点没有加入的距离（Math.abs(positions[i+1]-positions[i-1])）做差 并且找到差最大的值 最后求出所有的
 * 距离再减掉最大的差 就是最短距离
 */
public class DuDuXiongHuiJia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        int[] positions;
        while (scanner.hasNext()) {
            N = scanner.nextInt();
            positions = new int[N];
            for (int i = 0; i < N; i++) {
                positions[i] = scanner.nextInt();
            }
            //最大的差值
            int maxGap = 0;
            //当前差值
            int curGap = 0;
            for (int i = 1; i < N - 1; i++) {
                curGap =Math.abs(positions[i] - positions[i - 1])
                        + Math.abs(positions[i + 1] - positions[i])
                        - Math.abs(positions[i + 1] - positions[i - 1]);
                if (maxGap < curGap){
                    maxGap=curGap;
                }
            }
            int result = 0;
            for (int i = 1; i < N; i++) {
                result+=Math.abs(positions[i]-positions[i-1]);
            }
            result-=maxGap;
            System.out.println(result);
        }
    }

}
