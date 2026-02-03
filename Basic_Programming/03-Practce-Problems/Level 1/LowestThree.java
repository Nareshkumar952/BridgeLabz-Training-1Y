import java.util.Scanner;
class LowestThree {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int min;
if(a<b && a<c){
min=a;
System.out.println(min);}
else if(b<c){
min=b;
System.out.println(min);}
else {
min=c;
System.out.println(min);}}}