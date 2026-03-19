package com.gla.methods.Assignment.Level1;

import java.util.Scanner;

public class SimpleInterest {
    static double SI(int p,int r,int t){
  double si=(p*r*t)/100;
          return si;
    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        int t=s.nextInt();
        int r=s.nextInt();
        double re=SI(p,r,t);
        System.out.println(re);
    }
}
