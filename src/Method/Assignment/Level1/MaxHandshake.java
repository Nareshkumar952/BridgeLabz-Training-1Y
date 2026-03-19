package com.gla.methods.Assignment.Level1;

import java.util.Scanner;

public class MaxHandshake {
    static double h(int n){
        double re=(n*(n-1))/2;
        return re;
    }
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        double re=h(a);
        System.out.println(re);
    }
}
