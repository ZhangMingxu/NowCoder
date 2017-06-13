package com.zhangmingxu.netease;


import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/5/17.
 */
public class PaoTaiGongJi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = 0;
        int[][] point = new int[4][2];
        while(scanner.hasNext()){
            R = scanner.nextInt();
            for (int i = 0; i < 4; i++) {
                point[i][0] = scanner.nextInt();
                point[i][1] = scanner.nextInt();
            }
            int result = 0;
            for (int i = 0; i < 3; i++) {
                double a = PaoTaiGongJi.jisuan(point[i][0], point[i][1], point[3][0], point[3][1]);
                if (R >= a) {
                    result++;
                }
            }
            System.out.println(result + "x");
        }

    }
    public static double jisuan(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
}
