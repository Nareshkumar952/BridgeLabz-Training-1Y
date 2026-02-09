package String_Assignment;

import java.util.Scanner;

public class UseBySubString {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        int start=s.nextInt();
        int end=s.nextInt();
        for(int i=start;i<end;i++){
            s2=s2+s1.charAt(i);
        }
        String by=s1.substring(start,end);
        if(s2.equals(by)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
