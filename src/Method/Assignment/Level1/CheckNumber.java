package com.gla.methods.Assignment.Level1;

import java.util.Scanner;

public class CheckNumber {
    static int check(int n){
        if(n<0){
            return -1;
        }
        else if(n==0){
            return 0;
        }
        else{
            return 1;
        }}

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c=check(a);
        System.out.println(c);
    }
}
