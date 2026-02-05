package Java_Assignment.Level2;

import java.util.Scanner;

public class FrequencyOfDigit {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Digit  Frequency");
        for(int i=0;i<10;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<10;i++){
            int c=0;
            for(int j=0;j<10;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            System.out.println(arr[i]+"  "+c);
        }
    }
}
