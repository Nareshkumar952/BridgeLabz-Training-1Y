import java.util.Scanner;
class FizzBuzz {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int i;
if(a>0){
for(i=1;i<=a;i++){
if (i%3==0){
System.out.println("Fizz");}
else if (i%5==0) {
System.out.println("Buzz");}
else if(i%3==0&&i%5==0){
System.out.println("Fizz Buzz");}}}
else { System.out.println("Not Positive");}}}