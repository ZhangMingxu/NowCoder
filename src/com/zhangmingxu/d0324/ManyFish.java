package com.zhangmingxu.d0324;

import java.util.Scanner;

/**
 * Created by User on 2017/3/24.
 */
public class ManyFish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minSize = scanner.nextInt();
        int maxSize = scanner.nextInt();
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i =0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println(doSomeThing(minSize, maxSize, n, a));

    }

    public static int doSomeThing(int minSize, int maxSize, int n, int[] size) {
        int count=0;
        boolean eatable=false;
        for (int i=minSize;i<=maxSize;i++){
            for (int j=0;j<n;j++){
                if ((i>=size[j]*2&i<=size[j]*10)||(size[j]>=i*2&&size[j]<=i*10)){
                    eatable=true;
                    break;
                }else {
                    eatable=false;
                }
            }
            if (!eatable){
                count++;
            }
        }

        return count;
    }
}
