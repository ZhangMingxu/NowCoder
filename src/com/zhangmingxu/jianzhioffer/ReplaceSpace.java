package com.zhangmingxu.jianzhioffer;

/**
 * Created by 张明旭 on 2017/6/8.
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        String result = str.toString().replace(" ","%20");
        return result;
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy.");
        String s = new ReplaceSpace().replaceSpace(str);
        System.out.print(s);
    }
}
