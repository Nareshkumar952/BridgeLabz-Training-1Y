package com.gla.ClassAndObject;

import java.util.Scanner;

class CartItem{
    String ItemName;
    double Price;
    int quantity;
    public void Add(){
        Scanner s=new Scanner(System.in);
        ItemName=s.next();
        Price=s.nextDouble();
        quantity=s.nextInt();
    }
public void Remove(){
        quantity=0;
    System.out.println("Item Removed");
    }
public void Display(){
        double total=Price*quantity;
    System.out.println(ItemName);
    System.out.println(Price);
    System.out.println(quantity);
    System.out.println(total);
}
}
public class Cart {
    static void main(String[] args) {
        CartItem c=new CartItem();
        c.Add();
        c.Remove();
        c.Display();
    }
}
