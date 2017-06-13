package com.zhangmingxu.JD;

/**
 * Created by 张明旭 on 2017/5/23.题目描述
 * 题目描述
 * 有一楼梯共m级，刚开始时你在第一级，若每次只能跨上一级或者二级，要走上m级，共有多少走法？注：规定从一级到一级有0种走法。
 * 给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100。为了防止溢出，请返回结果Mod 1000000007的值。
 * 测试样例：
 * 3
 * 返回：2
 */
public class GoUpstairs {
    public int countWays(int n) {
        // write code here

        int[]dp = new int[n+1];
        dp[1]=1;
        dp[2]=1;
        for (int i = 2; i <=n ; i++) {
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new GoUpstairs().countWays(88));
    }
}
