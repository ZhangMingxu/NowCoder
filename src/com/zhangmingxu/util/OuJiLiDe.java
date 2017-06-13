package com.zhangmingxu.util;

/**
 * Created by 张明旭 on 2017/5/12.
 * 欧几里德算法求最大公约数
 */
public class OuJiLiDe {
    /**
     * 欧几里得算法最初版
     * f(a,b)=f(b,a%b)
     * 利用公式 f(a,b)=f(b,a%b)
     * @param a
     * @param b
     * @return
     */
    public static int maxCommonDivisor1(int a,int b) {
        int temp;
        //为了保证a>b 不满足时交换
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * 欧几里得算法有一个局限那就是在很大的数求余运算时消耗很大 所以把 a%b 改为 a-b 运算
     * 得到公式改进版 f(a,b)=f(b,a-b)
     * @param a
     * @param b
     * @return
     */
    public static int maxCommonDivisor2(int a,int b){
        int temp;
        if (a<b){
            temp=a;
            a=b;
            b=temp;
        }
        while (b!=0){
            temp=b;
            b=a-b;
            a=temp;
        }
        return a;
    }
}

