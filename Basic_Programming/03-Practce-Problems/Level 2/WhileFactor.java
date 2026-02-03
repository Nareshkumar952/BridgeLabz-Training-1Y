import java.util.Scanner;
class WhileFactor {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int i=1;
while(i<=a){
	if(a%i){
	System.out.println(i);}
i++;}}}