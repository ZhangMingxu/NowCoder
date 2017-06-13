package com.zhangmingxu.moni;

import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/5/19.
 * 牛牛定义排序子序列为一个数组中一段连续的子序列,并且这段子序列是非递增或者非递减排序的。牛牛有一个长度为n的整数数组A,
 * 他现在有一个任务是把数组A分为若干段排序子序列,牛牛想知道他最少可以把这个数组分为几段排序子序列.
 * 如样例所示,牛牛可以把数组A划分为[1,2,3]和[2,2,1]两个排序子序列,至少需要划分为2个排序子序列,所以输出2
 * 输入描述:
 * 输入的第一行为一个正整数n(1 ≤ n ≤ 10^5)
 * <p>
 * 第二行包括n个整数A_i(1 ≤ A_i ≤ 10^9),表示数组A的每个数字。
 * <p>
 * <p>
 * 输出描述:
 * 输出一个整数表示牛牛可以将A最少划分为多少段排序子序列
 * <p>
 * 输入例子:
 * 6
 * 1 2 3 2 2 1
 * <p>
 * 输出例子:
 * 2
 */
public class PaiXuZiXuLie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] data;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            int couut=1;
            int flag = 1; // 1升序 0相等 -1降序

            data = new int[n];
            for (int i = 0; i < n; i++) {
                data[i] = scanner.nextInt();
            }
            if (n==2){
                couut=1;
            }else {
                if (data[0]<data[1]){
                    flag=1;
                }else if (data[0]==data[1]){
                    flag=0;
                }else {
                    flag=-1;
                }
                for (int i = 2; i < n; i++) {
                    if (((flag==1)&(data[i]<data[i-1]))||((flag==-1))&data[i]>data[i-1]){
                        couut++;
                        if (i!=n-1){
                            if (data[i]<data[i+1]){
                                flag=1;
                            }else if (data[i]==data[i+1]){
                                while(data[i]==data[i+1]&&i!=n-1){
                                    i++;
                                }
                                if (data[i]<data[i+1]){
                                    flag=1;
                                } else if (data[i] > data[i+1]) {
                                    flag=-1;
                                }
                            }else {
                                flag=-1;
                            }
                            i++;
                        }
                    }

                }
            }
            System.out.println(couut);

        }
    }
}
