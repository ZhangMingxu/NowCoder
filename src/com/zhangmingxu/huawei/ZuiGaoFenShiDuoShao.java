package com.zhangmingxu.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/5/8.
 * 题目描述
 * 老师想知道从某某同学当中，分数最高的是多少，现在请你编程模拟老师的询问。当然，老师有时候需要更新某位同学的成绩.
 * 输入描述:
 * 输入包括多组测试数据。
 * 每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,分别代表学生的数目和操作的数目。
 * 学生ID编号从1编到N。
 * 第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩
 * 接下来又M行，每一行有一个字符C（只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候, 表示这是一条询问操作，
 * 他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少
 * 当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B。
 * <p>
 * <p>
 * 输出描述:
 * 对于每一次询问操作，在一行里面输出最高成绩.
 * <p>
 * 输入例子:
 * 5 7
 * 1 2 3 4 5
 * Q 1 5
 * U 3 6
 * Q 3 4
 * Q 4 5
 * U 4 5
 * U 2 9
 * Q 1 5
 * <p>
 * 输出例子:
 * 5
 * 6
 * 5
 * 9
 */
public class ZuiGaoFenShiDuoShao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int N;
            int M;
            String C;
            int[] grades;
            int A;
            int B;
            N = scanner.nextInt();
            M = scanner.nextInt();
            grades = new int[N];
            for (int i = 0; i < N; i++) {
                grades[i] = scanner.nextInt();
            }
            for (int i = 0; i < M; i++) {
                C = scanner.next();
                A = scanner.nextInt();
                B = scanner.nextInt();
                switch (C) {
                    case "Q":
                        if (A>B){
                            System.out.println(getMax(grades,B,A));
                        }else{
                            System.out.println(getMax(grades,A,B));
                        }

                        break;
                    case "U":
                        grades[A - 1] = B;
                        break;
                    default:
                        break;
                }
            }
        }
    }
    private static int getMax(int [] target,int begin,int end){
        int max = target[begin-1] ;
        for (int i = begin+1; i <=end ; i++) {
            if (target[i-1]>max){
                max=target[i-1];
            }
        }
        return max;
    }
}
