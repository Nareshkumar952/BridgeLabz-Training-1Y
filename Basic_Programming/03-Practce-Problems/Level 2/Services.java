import java.util.Scanner;
class Services {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int Salary=s.nextInt();
int year=s.nextInt();
if(year>=5){
double b=Salary*0.05;
System.out.println(b);}
else{System.out.println("Not 5 year Service");}}}