package com.gla.ClassAndObject.Level2;
class HotelBooking{
    String GuestName;
    String Roomtype;
    int nights;
    HotelBooking(){
        GuestName=" ";
        Roomtype=" ";
        nights= 2;
    }
    HotelBooking(String g,String r,int n){
        GuestName=g;
        Roomtype=r;
        nights=n;
    }
    HotelBooking(HotelBooking h){
        GuestName=h.GuestName;
        Roomtype=h.Roomtype;
        nights=h.nights;
    }
    void display(){
        System.out.println(GuestName);
        System.out.println(Roomtype);
        System.out.println(nights);
    }
}
public class Hotel {
    static void main(String[] args) {
        HotelBooking h=new HotelBooking();
        HotelBooking h1=new HotelBooking("Naresh","Luxary",8);
        HotelBooking h2=new HotelBooking(h1);
        h.display();
        h1.display();
        h2.display();
    }
}
