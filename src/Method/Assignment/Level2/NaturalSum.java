package com.gla.methods.Assignment.Level2;

import java.util.Scanner;

public class NaturalSum {
    static double Sum(int n){
        if(n>0){
            double s=n*(n+1)/2;
            return s;
        }
        return n;
    }

    static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int a=d.nextInt();
        double re=Sum(a);
        System.out.println(re);
    }
}
