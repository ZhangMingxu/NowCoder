package com.zhangmingxu.netease;

import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/5/12.
 * 小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为 a.在接下来的一段时间内,他将会依次遇见n
 * 个怪物,每个怪物的防御力为b1,b2,b3...bn. 如果遇到的怪物防御力bi小于等于小易的当前能力值c,那么他就能轻松打败怪物,
 * 并且使得自己的能力值增加bi;如果bi大于c,那他也能打败怪物,但他的能力值只能增加bi 与c的最大公约数.那么问题来了,
 * 在一系列的锻炼后,小易的最终能力值为多少?
 * <p>
 * 输入描述:
 * 对于每组数据,第一行是两个整数n(1≤n<100000)表示怪物的数量和a表示小易的初始能力值.
 * 第二行n个整数,b1,b2...bn(1≤bi≤n)表示每个怪物的防御力
 * <p>
 * <p>
 * 输出描述:
 * 对于每组数据,输出一行.每行仅包含一个整数,表示小易的最终能力值
 * <p>
 * 输入例子:
 * 3 50
 * 50 105 200
 * 5 20
 * 30 20 15 40 100
 * <p>
 * 输出例子:
 * 110
 * 205
 */
public class XiaoYiDeShengJiZhiLu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int a;
        int[] gws;
        int k;
        while(scanner.hasNext()){
            n=scanner.nextInt();
            a=scanner.nextInt();
            for (int i = 0; i < n; i++) {
                k =scanner.nextInt();
                if (k<=a){
                    a+=k;
                }else {
                    a+=jiSuan(k,a);
                }
            }
            System.out.println(a);
        }
    }

    /**
     * 计算最大公约数
     * 欧几里德算法
     * 最大公约数表示为f(a,b),并且有a>=b>0
     * f(a,b)=f(b,a%b)
     * @param a 大数
     * @param b 小数
     * @return 最大公约数
     */
    public static int jiSuan(int a,int b){
        int temp;

        while (b!=0){
            temp = b;
            b = a%b;
            a=temp;
        }
        return a;
    }
}
