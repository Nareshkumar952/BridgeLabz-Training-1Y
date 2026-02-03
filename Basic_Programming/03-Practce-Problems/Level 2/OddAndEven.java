import java.util.Scanner;
class OddAndEven {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
for(int i=1;i<=a;i++){
	if(i%2==0){
	System.out.println(i+"number is Even");}
	else{
System.out.println(i+"Number is Odd");}}}}