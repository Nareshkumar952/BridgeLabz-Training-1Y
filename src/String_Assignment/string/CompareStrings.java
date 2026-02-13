package com.gla.string;

import java.util.Scanner;

public class CompareStrings {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        boolean found=true;
        for(int i=0;i<a.length();i++) {
            if (a.charAt(i) == b.charAt(i)) {
               found=true;
            }
            else{
                found=false;
            }
        }
    if (found){
        System.out.println("Equals");}
    else{
        System.out.println("Not Equals");
    }
    }}
