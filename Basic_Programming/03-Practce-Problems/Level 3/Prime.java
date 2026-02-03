import java.util.Scanner;
class Prime {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int c;
int i;
for(i=1;i<=a;i++){
if(a%i){
c++;}}
if(c==2){
System.out.println("Prime");}
else {
System.out.println("Not Prime");}}}