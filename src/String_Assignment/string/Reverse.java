package com.gla.string;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        for(int i=a.length()-1;i>=0;i--){
            char ch=a.charAt(i);
            System.out.print(ch);
        }
    }
}
