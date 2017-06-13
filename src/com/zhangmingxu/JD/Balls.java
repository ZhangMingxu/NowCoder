package com.zhangmingxu.JD;

import java.util.*;

/**
 * Created by 张明旭 on 2017/4/7.
 * <p>
 * 小东和三个朋友一起在楼上抛小球，他们站在楼房的不同层，假设小东站的楼层距离地面N米，
 * 球从他手里自由落下，每次落地后反跳回上次下落高度的一半，并以此类推知道全部落到地面不跳，
 * 求4个小球一共经过了多少米？(数字都为整数)
 * 给定四个整数A,B,C,D，请返回所求结果。
 * 测试样例：
 * 100,90,80,70
 * 返回：1020
 */
public class Balls {
    public static void main(String[] args) {
//        Balls b = new Balls();
//        System.out.println(b.calcDistance(100,90,80,70));
        String s1="hello";
        String s2= "he"+new String("llo");
        System.out.println(s1==s2);
    }
    public int calcDistance(int A, int B, int C, int D) {
        // write code here
        //return (int)(getLong(A)+getLong(B)+getLong(C)+getLong(D));
        return (int)(getLong1(A)+getLong1(B)+getLong1(C)+getLong1(D));
    }
    public double getLong(double a){
        if (a==0){
            return 0;
        }else {
            return a+a/2+getLong(a/2);
        }
    }
    public double getLong1(double a){
        double longs = a;
        while (a!=0){
            longs+=a;
            a/=2.0;
        }
        return longs;
    }
}
abstract class a{
    a(){
        
    }
}
