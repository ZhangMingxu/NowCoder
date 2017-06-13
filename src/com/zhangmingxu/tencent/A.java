package com.zhangmingxu.tencent;

import java.util.Scanner;

/**
 * Created by User on 2017/3/25.
 * 小Q最近遇到了一个难题：把一个字符串的大写字母放到字符串的后面，各个字符的相对位置不变，且不能申请额外的空间。
 * 你能帮帮小Q吗？
 *
 *                               已通过！！！！！！！！
 */
public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            char[] chars =scanner.nextLine().toCharArray();
            for (int i = 0;i<chars.length;i++){
                if (chars[i]<='z'&&chars[i]>='a'){
                    System.out.print(chars[i]);
                }
            }
            for (int i = 0;i<chars.length;i++){
                if (chars[i]<='Z'&&chars[i]>='A'){
                    System.out.print(chars[i]);
                }
            }
            System.out.println();
        }
    }
}
