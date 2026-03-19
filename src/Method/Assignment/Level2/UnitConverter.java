package com.gla.methods.Assignment.Level2;

import java.util.Scanner;

public class UnitConverter {
    static void con(int n){
        double km2miles=0.213*n;
        double miles2km=1.609*n;
        double meters2feet=3.280*n;
        double feet2meters=0.304*n;
        System.out.println(km2miles);
        System.out.println(miles2km);
        System.out.println(meters2feet);
        System.out.println(feet2meters);
    }

   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        con(a);
    }
}
