package com.gla.methods.Assignment.Level2;

import java.util.Scanner;

public class Equation {
    static void  delta(int a, int b, int c){
        double de=Math.pow(b,2)-(4*a*c);
        if(de>0){
            double x1=(-b+ Math.sqrt(de))/(2*a);
            double x2=(-b- Math.sqrt(de))/(2*a);
            System.out.println(x1);
            System.out.println(x2);
        }
        else if(de==0){
            double x1=(-b)/(2*a);
            System.out.println(x1);
        }
        else {
            System.out.println("Empty");
        }
    }

    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
             delta(a,b,c);

    }}
