package com.gla.ClassAndObject.Level2;
class Circle{
    double Radius;
    Circle(double r){
       Radius=r;
    }
    void Display(){
        System.out.println(Radius);
    }
}
public class Circles {
    static void main(String[] args) {
        Circle c=new Circle(5);
    c.Display();
    }
}
