package java_Arrays;
import java.util.Scanner;
public class Transverse {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int arr[]=new int[a];
     int i;
     for(i=0;i<a;i++){
         arr[i]=s.nextInt();
     }
    for(i=0;i<a;i++){
        System.out.print(arr[i]+" ");}
    }
}
