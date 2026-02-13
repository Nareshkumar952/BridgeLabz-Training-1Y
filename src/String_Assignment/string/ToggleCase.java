package com.gla.string;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            String a=s.next();
            String b="";
            for(int i=0;i<a.length();i++){
                char ch=a.charAt(i);
                if(ch>='a'&&ch<='z'){
                    b=b+(char)(ch-32);
                }
                else{
                    b=b+(char)(ch+32);
                }
            }
        System.out.print(b);
    }
}
