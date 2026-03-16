package com.gla.ClassAndObject.Level2;
class Person{
    String Name;
    int age;
    Person(String n,int a){
        Name=n;
        age=a;
    }
    Person(Person p){
        Name=p.Name;
        age=p.age;
    }
    void display(){
        System.out.println(Name);
        System.out.println(age);
    }
}
public class CopyOtherPerson {
    static void main(String[] args) {
    Person p=new Person("Naresh",20);
    Person p1=new Person(p);
    p.display();
    p1.display();
    }
}
