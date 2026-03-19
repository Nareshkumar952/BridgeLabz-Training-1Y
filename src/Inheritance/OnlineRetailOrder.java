package com.gla.Inheritance;
class Order{
    int OrderId;
    int OrderDate;
    void dis(){
        System.out.println(OrderId);
        System.out.println(OrderDate);
    }
}
class ShippedOrder extends Order{
    int TrackingNumber;
    void di(){
        System.out.println(TrackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder{
    int deliveryDate;
    void display(){
        System.out.println(deliveryDate);
    }
}
public class OnlineRetailOrder {
    static void main(String[] args) {
DeliveredOrder d=new DeliveredOrder();
d.dis();
d.di();
d.display();
    }
}
