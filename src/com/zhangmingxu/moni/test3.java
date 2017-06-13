package com.zhangmingxu.moni;

import java.util.Scanner;

/**
 * Created by Sephiroth on 2017/5/19.
 */
public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int [][] data;
        int []cz;
        while (scanner.hasNext()){
            n=scanner.nextInt();
            data=new int[n][2];
            cz =new int[n];
            for (int i = 0; i < n; i++) {
                data[i][0]=scanner.nextInt();
                data[i][1]=scanner.nextInt();
                cz[i]=data[i][1]-data[i][0];
            }
            
        }
    }
}
