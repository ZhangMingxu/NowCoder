package com.zhangmingxu.tencent;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 张明旭 on 2017/5/16.
 */
public class Gift {
    /**
     * 题目描述
     * 春节期间小明使用微信收到很多个红包，非常开心。在查看领取红包记录时发现，某个红包金额出现的次数超过了红包总数的一半。
     * 请帮小明找到该红包金额。写出具体算法思路和代码实现，要求算法尽可能高效。
     * 给定一个红包的金额数组gifts及它的大小n，请返回所求红包的金额。
     * 若没有金额超过总数的一半，返回0。
     * 测试样例：
     * [1,2,3,2,2],5
     * 返回：2
     *
     * @param gifts
     * @param n
     * @return
     */
    public int getValue(int[] gifts, int n) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(gifts[0],1);
        for (int i = 1; i < n; i++) {
            if (map.keySet().contains(gifts[i])){
                map.put(gifts[i],map.get(gifts[i])+1);
            }else {
                map.put(gifts[i],1);
            }
        }
        for (Integer i : map.keySet()){
            if (map.get(i)>n/2){
                return i;
            }
        }
        // write code here
        return 0;
    }

    public static void main(String[] args) {
        int[] data = {1,2,3,2,2};
        System.out.println(new Gift().getValue(data,data.length));

    }
}
