package com.example.demo.test;

import java.util.Hashtable;

/**
 * @author Nikki
 * @create 2022-09-25 22:56
 */
public class Person {

    private  String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("eat.....");
    }

    private void say(){
        System.out.println("say.....");
    }

    public void hear(int i){
        System.out.println("hear.....");
    }
    public static void look(int i){
        System.out.println("look.....");
    }

}
