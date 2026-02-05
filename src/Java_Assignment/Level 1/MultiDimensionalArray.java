package Java_Assignment;
import java.util.Scanner;
public class MultiDimensionalArray {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int a[]=new int[9];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int c=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[c++]=arr[i][j];
            }
        }
        for(int i=0;i<9;i++){
            System.out.print(a[i]+" ");
        }
    }
}
