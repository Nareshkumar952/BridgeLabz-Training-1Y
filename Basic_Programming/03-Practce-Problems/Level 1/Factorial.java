import java.util.Scanner;
class Factorial {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int fact=1;
int i=1;
int a=s.nextInt();
while(a>=i){
fact=fact*i;
i++;}
System.out.println(fact);}}