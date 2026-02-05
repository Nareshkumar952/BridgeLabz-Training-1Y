package Java_Assignment;

import java.util.Scanner;

public class FirstAndLast {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<5;i++){
            if(arr[i]<0){
                System.out.print("Negative");
            }
            else if(arr[i]==0){
                System.out.print("Zero");
            }}
        if(arr[0]==arr[arr.length-1]){
            System.out.print("Equal");
        }
        else if(arr[0]>arr[arr.length-1]){
            System.out.print("greater");
        }
        else {
            System.out.print("lesser");
        }
    }
}
