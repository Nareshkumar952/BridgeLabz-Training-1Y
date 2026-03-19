package com.gla.methods.Assignment.Level1;

import java.util.Scanner;

public class Choclate {
    static int g(int M,int N){
        int a=N/M;
        System.out.println("Distribute");
        return a;
    }

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int e=s.nextInt();
    int q=s.nextInt();
    int re=g(e,q);
    System.out.println(re);
}}
