package com.zhangmingxu.baidu;

import java.util.*;

/**
 * Created by 张明旭 on 2017/5/10.
 */
public class MaiMaoZi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set ;
        int N;
        Object [] price;
        while (scanner.hasNext()){
            N = scanner.nextInt();
            set = new HashSet<>();
            for (int i = 0; i <N ; i++) {
                set.add(scanner.nextInt());
            }
            if (set.size()>=3){
                price = set.toArray();
                Arrays.sort(price);
                System.out.println(price[2]);

            }else {
                System.out.println(-1);
            }



        }
    }
}
