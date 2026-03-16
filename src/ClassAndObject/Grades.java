package com.gla.ClassAndObject;

import java.util.Scanner;

class Student{
    String name;
    int rollnumber;
    int marks;
    char grade;
    public void Input(){
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        rollnumber=sc.nextInt();
        marks=sc.nextInt();
    }
    public void Display(){
        System.out.println(name);
        System.out.println(rollnumber);
        System.out.println(marks);
    }
}
public class Grades {
    static void main(String[] args) {
        Student s=new Student();
        s.Input();
        s.Display();
    }
}
