package com.zhangmingxu.netease;

import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/6/9.
 * 给定一个字符串，请你将字符串重新编码，将连续的字符替换成“连续出现的个数+字符”。比如字符串AAAABCCDAA
 * 会被编码成4A1B2C1D2A。
 * 输入描述:
 * 每个测试输入包含1个测试用例
 * 每个测试用例输入只有一行字符串，字符串只包括大写英文字母，长度不超过10000。
 * <p>
 * <p>
 * 输出描述:
 * 输出编码后的字符串
 * <p>
 * 输入例子:
 * AAAABCCDAA
 * <p>
 * 输出例子:
 * 4A1B2C1D2A
 */
public class ZiFuChuanBianMa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String result = "";
        char c = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (c == str.charAt(i)){
                count++;
            }else {
                result += String.valueOf(count);
                result+=c;
                count = 1;
                c = str.charAt(i);
            }
        }
        result += String.valueOf(count);
        result+=c;
        System.out.print(result);
        scanner.close();
    }
}
