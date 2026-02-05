package Java_Assignment;

import java.util.Scanner;

public class Table6To9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[10];
        if(a>=6&&a<=9){
        for(int i=0;i<10;i++){
            arr[i]=a*(i+1);
        }
        }
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
