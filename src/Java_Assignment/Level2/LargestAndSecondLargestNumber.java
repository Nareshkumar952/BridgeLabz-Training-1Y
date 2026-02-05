package Java_Assignment.Level2;

import java.util.Scanner;

public class LargestAndSecondLargestNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[4];

        int i;
        for(i=0;i<3;i++){
            arr[i]=s.nextInt();
} int secmax=0;
        int max=arr[0];
        for( i=0;i<3;i++){
            if(arr[i]>max){
                max=arr[i];
            }}
                System.out.println(max);

        for( i=0;i<3;i++){
            if(arr[i]>secmax && secmax!=max){
                secmax=arr[i];
            }}
            System.out.print(secmax);
        }}
