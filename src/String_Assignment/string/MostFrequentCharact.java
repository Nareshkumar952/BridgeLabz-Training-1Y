package com.gla.string;

import java.util.Scanner;

public class MostFrequentCharact {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            String a=s.next();
            int count=0;
            char b=0;
            for(int i=0;i<a.length();i++){
                char ch=a.charAt(i);
            for(int j=1;j<a.length();j++){
                if(ch==a.charAt(j)){
                    b=ch;
                }
            }
                }
        System.out.println(b);
            }
    }
