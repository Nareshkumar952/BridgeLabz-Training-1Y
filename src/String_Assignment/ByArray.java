package String_Assignment;

import java.util.Scanner;

public class ByArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        char a[]=new char[s1.length()-1];
        for(int i=0;i<s1.length();i++){
            a[i]=s1.charAt(i);
        }
        for(int i=0;i<s1.length();i++){
         if(s1.charAt(i)==a[i]){
             System.out.println("ture");
         }
        }
    }
}
