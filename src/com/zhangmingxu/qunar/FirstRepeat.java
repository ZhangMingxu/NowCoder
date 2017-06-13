package com.zhangmingxu.qunar;

import java.util.ArrayList;

/**
 * Created by 张明旭 on 2017/5/16.
 */
public class FirstRepeat {
    /**
     * 题目描述
     * 对于一个字符串，请设计一个高效算法，找到第一次重复出现的字符。
     * 给定一个字符串(不一定全为字母)A及它的长度n。请返回第一个重复出现的字符。保证字符串中有重复字符，字符串的长度小于等于500。
     * 测试样例：
     * "qywyer23tdd",11
     * 返回：y
     *
     * @param A
     * @param n
     * @return
     */
    public char findFirstRepeat(String A, int n) {
        // write code here
        char[] chars = A.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j]) {
                    return chars[i];
                }
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s = "kdbaaak";
        System.out.println(new FirstRepeat().findFirstRepeat(s, s.length()));
    }
}
