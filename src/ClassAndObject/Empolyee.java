package com.gla.ClassAndObject;

class Emp{
    String name;
    int id;
    double salary;
public void Det(){
    System.out.println(name);
    System.out.println(id);
    System.out.println(salary);
}
}
public class Empolyee {
   public static void main(String[] args) {
 Emp e=new Emp();
 e.name="Ambani";
 e.id=122;
 e.salary=212;
 e.Det();
    }
}
