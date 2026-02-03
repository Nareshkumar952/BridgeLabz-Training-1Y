import java.util.Scanner;
class BMI {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
double Bmi=a/(b*b);
double c=bmi/10000;
if(c<=18){
System.out.println("UnderWeight");}
else if(c>=18.5 && c<=24.9){
System.out.println("Normal");}
else if(c>=25.0 && c<=39.9){
System.out.println("Overweight");}
else {
System.out.println("Obese");}}}