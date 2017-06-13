package com.zhangmingxu.xiaomi;

import java.util.Arrays;

/**
 * Created by 张明旭 on 2017/5/8.
 * 题目描述
 * 世界上有10种人，一种懂二进制，一种不懂。那么你知道两个int32整数m和n的二进制表达，有多少个位(bit)不同么？
 * 输入例子:
 * 1999 2299
 * <p>
 * 输出例子:
 * 7
 */
public class Solution {
    /**
     * 获得两个整形二进制表达位数不同的数量
     *
     * @param m 整数m
     * @param n 整数n
     * @return 整型
     */
    public int countBitDiff(int m, int n) {
        /*
        int dif=m^n;//先将二者做异或运算，得到结果；
        int cnt=0;
        while(dif!=0){
            dif=dif&(dif-1);
            cnt++;
        }             //统计一个整数dif含有多少个1；
        return cnt;
         */
        int result = 0;
        String bm = Integer.toBinaryString(m);
        String bn = Integer.toBinaryString(n);
        char[] cm = change(bm.toCharArray());
        char[] cn = change(bn.toCharArray());


        for (int i = 0; i < 32; i++) {
            if (cm[i] != cn[i]) {
                result++;
            }
        }
        result = result + Math.abs(cm.length - cn.length);
        return result;
    }

    private char[] change(char[] chars) {
        char[] result = new char[32];
        for (int i = 0; i < 32; i++) {
            if (i < 32 - chars.length) {
                result[i] = '0';
            } else if (i == (32 - chars.length)) {
                result[i] = chars[0];
            } else {
                result[i] = chars[i - 32 + chars.length];
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().countBitDiff(16807, 282475249));
    }
}
