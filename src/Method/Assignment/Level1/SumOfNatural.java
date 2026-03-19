package com.gla.methods.Assignment.Level1;

import java.util.Scanner;

public class SumOfNatural {
    static int sum(int n){
        int s=0;
        for(int i=0;i<=n;i++){
            s=s+i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int re=sum(a);
        System.out.println(re);
    }
}
