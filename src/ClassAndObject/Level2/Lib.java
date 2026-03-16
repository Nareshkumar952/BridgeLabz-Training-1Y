package com.gla.ClassAndObject.Level2;
class Booked{
    String Title;
    String Author;
    double Price;
    boolean Availability;
    Booked(String t,String a,double p,boolean av){
        Title=t;
        Author=a;
        Price=p;
        Availability=av;
    }
    void borrow(){
        if(Availability){
            Availability=true;
            System.out.println("Not Available");
        }
        else{
            System.out.println("Borrow Successfully");
        }
    }
    void display(){
        System.out.println(Title);
        System.out.println(Author);
        System.out.println(Price);
        System.out.println(Availability);
    }
}
public class Lib {
    static void main(String[] args) {
        Booked b=new Booked("Ambani Corporation","Ambani",500,true);
       b.display();
       b.borrow();
    }
}
