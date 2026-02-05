package Java_Assignment;
import java.util.Scanner;
public class Voting {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<a;i++){
            if(arr[i]>=18){
                System.out.println("Student can vote");
            }
            else {
                System.out.println("No vote age");
            }
        }
    }
}
