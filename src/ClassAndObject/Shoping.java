package com.gla.ClassAndObject;

import java.util.Scanner;

class Item{
    int ItemCode;
    String ItemName;
    double price;
    public void Value(){
        Scanner s=new Scanner(System.in);
        ItemCode=s.nextInt();
        ItemName=s.next();
        price=s.nextDouble();}
    public void Display(){
        System.out.println(ItemCode);
        System.out.println(ItemName);
        System.out.println(price);
    }
    void TotalCost(){
        Scanner s=new Scanner(System.in);
        int q=s.nextInt();
        double total=price*q;
        System.out.println(total);
    }
}

public class Shoping {
    static void main(String[] args) {
        Item i=new Item();
        i.Value();
        i.Display();
        i.TotalCost();
    }
}
