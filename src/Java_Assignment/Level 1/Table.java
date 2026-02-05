package Java_Assignment;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[10];
        int n=s.nextInt();
        for(int i=0;i<10;i++){
            arr[i]=n*(i+1);
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}
