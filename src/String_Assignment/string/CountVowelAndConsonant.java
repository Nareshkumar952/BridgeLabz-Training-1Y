package com.gla.string;
import java.util.Scanner;
public class CountVowelAndConsonant {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            String a=s.next();
        int vowels=0;
        int cons=0;
        for(int i=0;i<a.length();i++){
           char ch=a.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'|| ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }
            else{
                cons++;
            }
        }
        System.out.println(vowels);
        System.out.println(cons);
    }
}
