package com.zhangmingxu.qunar;

/**
 * Created by 张明旭 on 2017/5/9.
 */
public class BinarySearch {
    public int getPos(int[] A, int n, int val) {
        // write code here
        int begin = 0;
        int end = n-1;
        int mid = (begin+end)/2;
        while(begin<=end){
            if(val>A[mid]){
                begin = mid+1;
            }else if (val == A[mid]){
                if(mid>=1&&val==A[mid-1]){
                    end = mid-1;
                }else {
                    return mid;
                }
            }else {
                end = mid-1;
            }
            mid = (begin+end)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {4,4,10,21};
        System.out.println(new BinarySearch().getPos(A,4,4));

    }
}
