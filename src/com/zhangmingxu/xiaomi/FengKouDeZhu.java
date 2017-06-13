package com.zhangmingxu.xiaomi;

/**
 * Created by 张明旭 on 2017/5/24.
 * 题目描述
 * 风口之下，猪都能飞。当今中国股市牛市，真可谓“错过等七年”。 给你一个回顾历史的机会，已知一支股票连续n天的价格走势，
 * 以长度为n的整数数组表示，数组中第i个元素（prices[i]）代表该股票第i天的股价。 假设你一开始没有股票，
 * 但有至多两次买入1股而后卖出1股的机会，并且买入前一定要先保证手上没有股票。若两次交易机会都放弃，收益为0。 设计算法，
 * 计算你能获得的最大收益。 输入数值范围：2<=n<=100,0<=prices[i]<=100
 * 输入例子:
 * 3,8,5,1,7,8
 * <p>
 * 输出例子:
 * 12
 */
public class FengKouDeZhu {
    /**
     * 计算你能获得的最大收益
     *
     * @param prices Prices[i]即第i天的股价
     * @return 整型
     */
    public int calculateMax(int[] prices) {
        int firstBuy = Integer.MIN_VALUE;
        int firstSell = 0;
        int secondBuy = Integer.MIN_VALUE;
        int secondSell = 0;
        for (int curPrice : prices){
            firstBuy = Math.max(firstBuy,-curPrice);
            firstSell = Math.max(firstSell,firstBuy+curPrice);
            secondBuy = Math.max(secondBuy,firstSell-curPrice);
            secondSell = Math.max(secondSell,secondBuy+curPrice);
        }
        return secondSell;
    }

    public static void main(String[] args) {
        int[] prices = {3,8,5,1,7,8};
        System.out.println(new FengKouDeZhu().calculateMax(prices));
    }
}
