package com.gla.ClassAndObject;
class Mob{
    String model;
    String Company;
Mob(String n,String c){
    model=n;
    Company=c;
}
void Display(){
    System.out.println(model);
    System.out.println(Company);
}
}
public class cons {
    static void main(String[] args) {
        Mob m=new Mob("Naresh","Moto");
        m.Display();
    }
}
