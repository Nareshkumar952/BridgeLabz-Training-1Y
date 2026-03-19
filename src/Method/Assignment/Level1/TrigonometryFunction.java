package com.gla.methods.Assignment.Level1;

import java.util.Scanner;

public class TrigonometryFunction {
    static void fun(double de){
        double rad=Math.toRadians(de);
        double sin=Math.sin(rad);
        double cos=Math.cos(rad);
        double tan=Math.tan(rad);
        System.out.println(sin);
        System.out.println(cos);
        System.out.println(tan);
    }

   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        fun(a);
    }
}
