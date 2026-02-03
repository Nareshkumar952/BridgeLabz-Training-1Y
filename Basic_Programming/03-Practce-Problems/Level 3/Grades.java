import java.util.Scanner;
class Grades {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int  per=(a+b+c)/3;
if(per<=39){
System.out.println("Remedial");}
else if(per>=40 && per<=49){
System.out.println("Level 1");}
else if(per>=50 && per<=59){
System.out.println("Level 1");}
else if(per>=60 && per<=69){
System.out.println("Level 2");}
else if(per>=70 && per<=79){
System.out.println("Level 3");}
else {System.out.println("Level 4");}}} 