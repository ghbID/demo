package com.example.demo.test;

/**
 * @author Nikki
 * @create 2022-09-25 22:03
 */
public class StaticTest {
    public static void main(String[] args) {

        Chinese.nation = "中国";
//        Chinese.name = "asd";
        Chinese c1 = new Chinese();
        c1.name = "tom";
        c1.age = 20;
        c1.nation = "CHN";
        Chinese c2 = new Chinese();
        c2.name = "joy";
        c2.age = 30;
        c2.nation = "CHAIN";

        System.out.println(c1.name);
        System.out.println(c1.nation);
        Chinese.eat();
    }

}

class Chinese{
    String name;
    int age;
    static String nation ;
    static void eat(){}

}