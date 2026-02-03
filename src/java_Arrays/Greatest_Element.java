package java_Arrays;
import java.util.Scanner;
public class Greatest_Element {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]= new int[5];
        int max=arr[0];
        int i;
        for(i=0;i<5;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max);
    }
}
