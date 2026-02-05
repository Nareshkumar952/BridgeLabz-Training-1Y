package Java_Assignment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FootballTeam {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[11];
        int sum=0;
        for(int i=0;i<=10;i++){
            arr[i]=s.nextInt();
            sum=sum+arr[i];
        }
        int mean=sum/11;
        System.out.print(mean);
    }
}
