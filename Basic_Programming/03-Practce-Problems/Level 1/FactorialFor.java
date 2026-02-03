import java.util.Scanner;
class FactorialFor {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int fact=1;
int i=1;
int a=s.nextInt();
for(i=1;i<=a;i++){
fact=fact*i;
i++;}
System.out.println(fact);}}