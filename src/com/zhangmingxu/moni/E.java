package com.zhangmingxu.moni;

import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/4/3.
 * 牛牛在研究他自己独创的平衡数，平衡数的定义是：将一个数分成左右两部分，分别成为两个新的数。
 * 左右部分必须满足以下两点：
 * 1，左边和右边至少存在一位。
 * 2，左边的数每一位相乘如果等于右边的数每一位相乘，则这个数称为平衡数。
 * 例如：1221这个数，分成12和21的话，1*2=2*1，则称1221为平衡数，再例如：1236这个数，可以分成123和1*2*3=6，所以1236也是平衡数。而1234无论怎样分也不满足平衡数。
 * 输入描述:
 * 输入一个正整数（int范围内）。
 * <p>
 * <p>
 * 输出描述:
 * 如果该数是平衡数，输出 "YES", 否则输出 "NO"。
 * <p>
 * 输入例子:
 * 1221
 * 1234
 * <p>
 * 输出例子:
 * YES
 * NO
 */
public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            String q ="NO";
            int[] b = new int[a.length()];
            for (int i = 0; i < a.length(); i++) {
                b[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
            }
            if (b.length == 1) {
                System.out.println("NO");
            } else {
                for (int i = 1; i <b.length ; i++) {
                    int x = 1;
                    int y =1;
                    for (int j = 0; j <i ; j++) {
                        x*=b[j];
                    }
                    for (int j = i; j <b.length ; j++) {
                        y*=b[j];
                    }
                    if (x==y){
                        q="YES";
                        break;
                    }
                }
                System.out.println(q);
            }
        }
    }
}
