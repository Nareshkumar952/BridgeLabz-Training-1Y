package Java_Assignment.Level2;

import java.util.Scanner;

public class Grades {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int marks[]=new int[3];
        int sum=0;
        for(int i=0;i<3;i++){
            marks[i]=s.nextInt();
            sum=sum+marks[i];
        }
        int per=sum/3;
        if(per<=39){
            System.out.println("Remedial");
            System.out.println("R");
        } else if (per>=40 && per<=49) {
            System.out.println("Level 1");
            System.out.println("E");
        } else if (per>=50 && per<=59) {
            System.out.println("Level 1");
            System.out.println("D");
        } else if (per>=60 && per<=69) {
            System.out.println("Level 2");
            System.out.println("C");
        } else if (per>=70 && per<=79) {
            System.out.println("Level 3");
            System.out.println("B");
        }
        else{
            System.out.println("Level 4");
            System.out.println("A");
        }
    }
}
