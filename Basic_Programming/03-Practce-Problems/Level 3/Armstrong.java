import java.util.Scanner;
class Armstrong{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
org=a;
int i;
int r;
for(i=1;i<=a;i++){
r=a%10;
arm=(r*r*r)+10;
a=a/10;}
if(arm==org){
System.out.println("Armstrong");}
else {
System.out.println("Not");}}}