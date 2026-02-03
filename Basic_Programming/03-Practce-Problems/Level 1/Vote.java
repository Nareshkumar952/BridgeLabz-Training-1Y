import java.util.Scanner;
class Vote {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a>=18){
System.out.println("Can Vote");}
else {
System.out.println("Can not vote");}}}