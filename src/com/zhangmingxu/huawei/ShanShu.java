package com.zhangmingxu.huawei;

import java.util.Scanner;

/**
 * Created by 张明旭 on 2017/5/19.
 * 题目描述
 * 有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，求最后一个被删掉的数的原始下标位置。
 * 以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，0->1->2(删除)->3->4->5(删除)->6->7->0(删除),如此循环直到最后一个数被删除。
 * <p>
 * 输入描述:
 * 每组数据为一行一个整数n(小于等于1000)，为数组成员数,如果大于1000，则对a[999]进行计算。
 * <p>
 * <p>
 * 输出描述:
 * 一行输出最后一个被删掉的数的原始下标位置。
 * <p>
 * 输入例子:
 * 8
 * <p>
 * 输出例子:
 * 6
 */
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
    public Node(){

    }
}
public class ShanShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while(scanner.hasNext()){
            n=scanner.nextInt();
            Node head = new Node();
            Node pre = new Node();
            for (int i = 0; i < n; i++) {
                Node cur = new Node(i);
                if (i==0){
                    head = cur;
                    pre = cur;
                }else{
                    pre.next = cur;
                    pre = cur;
                }
            }
            pre.next=head;
            int count = 0;
            while(head!=pre){
                if (count==2){
                    pre.next = head.next;
                    count=0;
                }else {
                    pre=pre.next;
                    count++;
                }
                head = head.next;

            }
            System.out.println(head.data);
        }
    }

}
