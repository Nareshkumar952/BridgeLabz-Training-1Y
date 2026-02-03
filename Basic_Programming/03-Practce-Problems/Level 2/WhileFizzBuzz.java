import java.util.Scanner;
class WhileFizzBuzz {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int i;
if(a>0){
while(i<=a){
if(a%3==0){
System.out.println("Fizz");}
else if(i%5==0){
System.out.println("Buzz");}
else if(i%3==0 && i%5==0){
System.out.println("FizzBuzz");}}}
else {System.out.println("Not Positive");}}}