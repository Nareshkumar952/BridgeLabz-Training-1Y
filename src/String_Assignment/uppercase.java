package String_Assignment;

import java.util.Scanner;

import static java.lang.StringLatin1.charAt;

public class uppercase {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String s1=s.next();
       String s2="";
       for(int i=0;i<s1.length();i++){
           if(s1.charAt(i)>=97){
               s2=s1.charAt(i)-32;
           }
           else{
               s2=s1.charAt(i);
           }
       }
       String s3=s1.toUpperCase();
       if(s2==s3){
           System.out.println("true");
       }
       else{
           System.out.println("false");
       }

    }
}
