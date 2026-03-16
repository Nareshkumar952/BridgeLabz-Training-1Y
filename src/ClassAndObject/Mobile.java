package com.gla.ClassAndObject;

import java.util.Scanner;

class Phone{
    String brand;
    String model;
    double price;
    public void Input(){
        Scanner s=new Scanner(System.in);
        brand=s.next();
        model=s.next();
        price=s.nextDouble();
    }
    public void Display(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }
}
public class Mobile {
    static void main(String[] args) {
        Phone m=new Phone();
        m.Input();
        m.Display();
    }
}
