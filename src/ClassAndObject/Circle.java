package com.gla.ClassAndObject;

import java.util.Scanner;
class Area {
  public   void Area() {
      Scanner s=new Scanner(System.in);
      int r= s.nextInt();
        double ar = 3.14 * r * r;
        System.out.println(ar);
    }}
class Circumference{
   public void Circumference(){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
     double cir=2*3.14*r;
        System.out.println(cir);
        }
        }
public class Circle {
    public static void main(String[] args) {
        Area m=new Area();
        m.Area();
        Circumference c=new Circumference();
        c.Circumference();
    }
}
