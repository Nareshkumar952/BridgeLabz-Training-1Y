package Java_Assignment.Level2;

import java.util.Scanner;

public class ReverseDigit {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int c=0;
        while(temp>0){
            temp=temp/10;
           c++;
        }
        int arr[]=new int[c];
        int d=0;
        while(n>0){
            arr[d++]=n%10;
            n=n/10;
        }
        for(int i=0;i<c;i++){
            System.out.print(arr[i]);
        }


    }
}
