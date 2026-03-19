package com.gla.methods.Assignment.Level1;

import java.util.Scanner;

public class SpringSeason {
    static boolean ch(int month,int day){
        if(month>=3 && day<=20){
            return true;
        }
        else if(month<=6 && day<=31){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
      //  int d=ch(int a,int b);
      //  System.out.println(d);
    }
}
