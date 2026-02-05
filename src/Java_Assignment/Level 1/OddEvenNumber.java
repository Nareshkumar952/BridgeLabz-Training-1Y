package Java_Assignment;

import java.util.Scanner;

public class OddEvenNumber {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        int d=0;
        int arreven[]=new int[n];
        int arrodd[]=new int[n];
        for(int i=1;i<=n;i++){
            if(i%2==0){
                arreven[c++]=i;
            }
            else {
                arrodd[d++]=i;
            }
        }
        for(int i=0;i<c;i++){
            System.out.print(arreven[i]+" ");
        }
        System.out.println(" ");
        for(int i=0;i<d;i++){
            System.out.print(arrodd[i]+" ");
        }
    }
}
