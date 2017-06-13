package com.zhangmingxu.huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by 张明旭 on 2017/5/19.
 * 题目描述
 * 输入一个字符串，求出该字符串包含的字符集合
 * <p>
 * 输入描述:
 * 每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写。
 * <p>
 * <p>
 * 输出描述:
 * 每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出。
 * <p>
 * 输入例子:
 * abcqweracb
 * <p>
 * 输出例子:
 * abcqwer
 */
public class ZiFuJiHe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            char[] chars = scanner.next().toCharArray();
            String result="";
            Set<Character> set = new HashSet<>();
            for (int i = 0; i <chars.length ; i++) {
                if (set.add(chars[i])){
                    result+=chars[i];
                }
            }
            System.out.println(result);
        }
    }
}
