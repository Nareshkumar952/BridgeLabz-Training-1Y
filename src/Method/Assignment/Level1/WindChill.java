package com.gla.methods.Assignment.Level1;

import java.util.Scanner;
public class WindChill {
    static double temperature(double temp,double speed){
        double wind=35.74+0.6215*temp+(0.4275*temp-35.75)*Math.pow(speed,0.16);
        return wind; }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double b=s.nextDouble();
      double re=temperature(a,b);
        System.out.println(re);
    }}
