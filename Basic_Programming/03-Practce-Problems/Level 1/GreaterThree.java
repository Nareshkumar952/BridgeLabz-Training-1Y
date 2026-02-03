import java.util.Scanner;
class GreaterThree {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int max;
if(a>b && a>c){
max=a;
System.out.println(max);}
else if(b>c){
max=b;
System.out.println(max);}
else {
max=c;
System.out.println(max);}}}