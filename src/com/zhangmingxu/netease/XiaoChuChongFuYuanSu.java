package com.zhangmingxu.netease;

import java.util.*;

/**
 * Created by 张明旭 on 2017/3/26.
 小易有一个长度为n序列，小易想移除掉里面的重复元素，但是小易想是对于每种元素保留最后出现的那个。小易遇到了困难,希望你来帮助他。
 输入描述:
 输入包括两行：
 第一行为序列长度n(1 ≤ n ≤ 50)
 第二行为n个数sequence[i](1 ≤ sequence[i] ≤ 1000)，以空格分隔


 输出描述:
 输出消除重复元素之后的序列，以空格分隔，行末无空格

 输入例子:
 9
 100 100 100 99 99 99 100 100 100

 输出例子:
 99 100

                        以通过！！！！！！！
 */
public class XiaoChuChongFuYuanSu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i =0;i<n;i++){
                a[i] = scanner.nextInt();
            }
            Map<Integer,Integer> map = new TreeMap<>();
            for (int i = 0;i<n;i++){
                map.put(a[i],i);
            }
            List<Integer> list = new ArrayList<>();
            for (Integer i : map.keySet()){
                list.add(map.get(i));
            }
            Collections.sort(list);
            for (int i = 0;i<list.size();i++){
                if (i==list.size()-1){
                    System.out.println(a[list.get(i)]);
                }else {
                    System.out.print(a[list.get(i)]+" ");
                }

            }
        }
    }
}
