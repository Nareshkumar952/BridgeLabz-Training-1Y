package com.gla.methods.Assignment.Level2;

import java.util.Scanner;

public class Vote {
    static  boolean vote(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }

    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for(int i=0;i<10;i++){
            int a=s.nextInt();
    boolean q=vote(a);
        }
    }
}
