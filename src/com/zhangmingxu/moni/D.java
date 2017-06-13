package com.zhangmingxu.moni;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/4/3.
 * 牛牛在二维坐标系中画了N个点，且都是整点。现在牛牛想画出一个矩形，使得这N个点都在矩形内或者在矩形上。
 * 矩形的边均平行于坐标轴。牛牛希望矩形的面积最小。请你帮助牛牛计算下最小矩形的面积。
 * 输入描述:
 * 首先输入一个正整数N表示点的个数（2 <= N <= 50）
 * <p>
 * 接下来N行每行两个整数x, y，表示该点的坐标。绝对值均小于等于100.
 * <p>
 * <p>
 * 输出描述:
 * 一个整数表示最小矩形的面积。
 * <p>
 * 输入例子:
 * 2
 * 0 1
 * 1 0
 * <p>
 * 输出例子:
 * 1
 */
public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N = scanner.nextInt();
            int []pX = new int[N];
            int []pY = new int[N];
            for (int i = 0; i <N ; i++) {
                pX[i]=scanner.nextInt();
                pY[i]=scanner.nextInt();
            }
            Arrays.sort(pX);
            Arrays.sort(pY);
            System.out.println((pX[N-1]-pX[0])*(pY[N-1]-pY[0]));
        }
    }
}
