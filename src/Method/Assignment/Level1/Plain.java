package com.gla.methods.Assignment.Level1;

import java.util.Scanner;

public class Plain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int org=n;
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=(rev*10)+r;
            n =n/10;
        }
        if(org==rev){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
