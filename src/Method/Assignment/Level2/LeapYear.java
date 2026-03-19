package com.gla.methods.Assignment.Level2;

import java.util.Scanner;

public class LeapYear {
    static void Year(int n){
        if((n%400==0)|| (n%4==0 && n%100!=0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
    }}

   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
         Year(a);
    }}
