package com.gla.methods.Assignment.Level1;

import java.util.Scanner;

public class TriangularPark {
    static double h(int a,int b,int c){
        double per=a+b+c;
        double round=(5/per);

        return round;
    }

   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            double re=h(a,b,c);
       System.out.println(re);
    }
}
