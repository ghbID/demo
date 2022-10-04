package com.example.demo.test;

/**
 * @author Nikki
 * @create 2022-09-05 10:09
 */
public class Tast1 {

//    public static void main(String[] args) {
//        String a = "asd";
//        new Tast1().funcl(a);
//        System.out.println(a);
//
//    }
//    public void funcl(String a){
//
//        a = "q";
////        return a;
//    }

    public static void main(String[] args) {
        //方法二（通常是）int[] ids = new int[]{1001,1002,1003,1004};

        int[] ids = new int[10];

        int a = 10;
        new Tast1().funcl(a);
        System.out.println(a);
    }
    public void funcl(int a){
        int b =10;
        System.out.println(a+b);
        a=11;


    }/**/



    /*
    public static void main(String[] args) {
        int a = 10;
        int funcl = new Tast1().funcl(a);
        System.out.println(funcl);
    }
    public int funcl(int a){
        int b =10;
        System.out.println(a+b);
        a=11;
        return a;

    }*/
}
