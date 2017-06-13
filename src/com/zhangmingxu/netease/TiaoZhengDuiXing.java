package com.zhangmingxu.netease;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by User on 2017/3/25.
 * 在幼儿园有n个小朋友排列为一个队伍，从左到右一个挨着一个编号为(0~n-1)。其中有一些是男生，有一些是女生，男生用'B'表示，女生用'G'表示。小朋友们都很顽皮，当一个男生挨着的是女生的时候就会发生矛盾。作为幼儿园的老师，你需要让男生挨着女生或者女生挨着男生的情况最少。你只能在原队形上进行调整，每次调整只能让相邻的两个小朋友交换位置，现在需要尽快完成队伍调整，你需要计算出最少需要调整多少次可以让上述情况最少。例如：
 * GGBBG -> GGBGB -> GGGBB
 * 这样就使之前的两处男女相邻变为一处相邻，需要调整队形2次
 *
 *                已通过！！！！！！！！！！！！！
 */
public class TiaoZhengDuiXing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int count=0;
           // boolean need=true;
            char[] chars = scanner.next().toCharArray();
            List<Integer> B = new ArrayList();
            List<Integer> G = new ArrayList();
            for (int i = 0;i<chars.length;i++){
                if(chars[i]=='B'){
                    B.add(i);

                }else {
                    G.add(i);
                }
            }
            if (B.size()!=0&&G.size()!=0){
                if (sum(B)/B.size()<sum(G)/G.size()){

                    for (int i =0;i<B.size();i++){
                        count =count+(B.get(i)-i);
                    }
                }else {
                    for (int i =0;i<G.size();i++){
                        count =count+(G.get(i)-i);
                    }
                }
            }else {
                count=0;
            }
            System.out.println(count);
        }

    }
    public static int sum(List<Integer> list){
        int sum=0;
        for (Integer i : list){
            sum+=i;
        }
        return sum;
    }

}
