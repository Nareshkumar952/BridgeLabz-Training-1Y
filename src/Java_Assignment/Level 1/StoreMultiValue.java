package Java_Assignment;

import java.util.Scanner;

public class StoreMultiValue {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i< arr.length-1;i++){
            arr[i]=s.nextInt();
            if(arr[i]==0){break;
        }

    }
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
}}
