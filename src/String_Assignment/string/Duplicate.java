package com.gla.string;

import java.util.Scanner;

public class Duplicate {
   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String result="";
        boolean found=false;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            for(int j=0;j<result.length();j++){
                char b=result.charAt(j);
                if(ch==b){
                    found=true;
                    break;
                }
            }
            if(!found){
                result+=ch;}}
       System.out.println(result);}}