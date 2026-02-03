import java.util.Scanner;
class CountDigit{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int i;
int c;
for(i=1;i<=a;i++){
a=a/10;
c++;}
System.out.println(c);}}