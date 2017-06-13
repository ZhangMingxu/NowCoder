package com.zhangmingxu.tencent;


/**
 * Created by 张明旭 on 2017/5/17.
 */
public class GrayCode {
    /**
     * 注：
     * 格雷码(Gray Code)是一个数列集合，每个数使用二进位来表示，假设使用n位元来表示每个数字，任两个数之间只有一个位元值不同。
     * 例如以下为3位元的格雷码： 000 001 011 010 110 111 101 100 。
     *
     * 在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同，   则称这种编码为格雷码(Gray Code)，请编写一个函数，使用递归的方法生成N位的格雷码。
     * 给定一个整数n，请返回n位的格雷码，顺序为从0开始。
     * 测试样例：
     * 1
     * 返回：["0","1"]
     *
     * @param n
     * @return
     */
    public String[] getGray(int n) {
        // write code here
        String[] strings;
        if (n==1){
            strings = new String[2];
            strings[0]="0";
            strings[1]="1";

        }else{
            String[] tem = getGray(n-1);
            strings = new String[tem.length*2];
            for (int i = 0; i <tem.length ; i++) {
                strings[i]="0"+tem[i];
                strings[strings.length-i-1]="1"+tem[i];
            }

        }
        return strings;
    }

    public static void main(String[] args) {
        String [] strings = new GrayCode().getGray(2);
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]+" ");
        }
    }
}
