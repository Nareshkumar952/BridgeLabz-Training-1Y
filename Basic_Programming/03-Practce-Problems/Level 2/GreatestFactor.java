import java.util.Scanner;
class GreatestFactor {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=1;
for(i=a-1;i>=1;i--){
if(a%i==0){ b=i;
break;}}
System.out.println(b)}}