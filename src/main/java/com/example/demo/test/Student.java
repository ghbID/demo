package com.example.demo.test;

/**
 * @author Nikki
 * @create 2022-09-25 22:58
 */
public class Student extends Person{

    String major;

//    public  void look(int i){
    public static void look(int i){
        System.out.println("Student.look.....");
    }

    public void hear(int i){ //重写
        System.out.println("Student.hear.....");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
//        student.say();编译不通过
        student.hear(1);//Student.hear.....
        student.look(1);//Student.look.....
    }
}
