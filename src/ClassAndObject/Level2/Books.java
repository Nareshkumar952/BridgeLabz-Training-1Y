package com.gla.ClassAndObject.Level2;
class Book{
    String Author;
    String Title;
    double Price;
    Book(){
        Author=" ";
        Title=" ";
        Price=0;
    }
   Book(String n,String a,double p){
       Author =n;
       Title=a;
       Price=p;
   }
   void Display(){
       System.out.println(Title);
       System.out.println(Author);
       System.out.println(Price);
   }
}
public class Books {
    static void main(String[] args) {
        Book b=new Book();
        Book b2=new Book("Java","ambani",500);
    b.Display();
    b2.Display();
    }
}
