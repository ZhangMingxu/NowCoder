package com.zhangmingxu.moni;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by 张明旭 on 2017/4/3.
 * 牛牛有N个字符串，他想将这些字符串分类，他认为两个字符串A和B属于同一类需要满足以下条件：
 * A中交换任意位置的两个字符，最终可以得到B，交换的次数不限。比如：abc与bca就是同一类字符串。
 * 现在牛牛想知道这N个字符串可以分成几类。
 * 输入描述:
 * 首先输入一个正整数N（1 <= N <= 50），接下来输入N个字符串，每个字符串长度不超过50。
 * <p>
 * <p>
 * 输出描述:
 * 输出一个整数表示分类的个数。
 * <p>
 * 输入例子:
 * 4
 * abcd
 * abdc
 * dabc
 * bacd
 * <p>
 * 输出例子:
 * 1
 *             妈的 想着很难 下一道
 */
public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N = scanner.nextInt();
            String[] strings = new String[N];
            Set<String> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                strings[i] = scanner.next();
            }
            for (int i = 0; i <strings.length ; i++) {
                char []x = strings[i].toCharArray();
                Arrays.sort(x);
                String temp = new String(x);
                set.add(temp);
            }
            System.out.println(set.size());
        }
    }
}
