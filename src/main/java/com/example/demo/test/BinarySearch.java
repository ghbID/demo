package com.example.demo.test;

//二分法查找
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 5, 8, 11, 19, 22, 31, 35, 40, 45, 48, 49, 50};
        int target = 48;
        int idx = binarySearch(array, target);
        System.out.println(idx);
    }

    //二分法查找，找到返回元素索引，招不到返回-1
    public static int binarySearch(int[] a, int t){
        //l-左边 r-右边 m-中间
        int l = 0, r = a.length -1, m;
        while (l <= r) {
            //m = (l + r) / 2; //l+r结果数值过大会存在溢出
            m = (l + r) >>> 1; //正数右移运算相当于除二
            if(a[m] == t) {
                return m;
            }else if (a[m] > t){
                r = m - 1;
            }else {
                l = m + 1;
            }
        }
        return -1;
    }
}