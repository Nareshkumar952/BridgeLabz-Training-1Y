import java.util.Scanner;
class Springseason{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int month=s.nextInt();
int day=s.nextInt();
if(3<=month && 6>=month){
System.out.println("Spring Season");}
else{ System.out.println("Not Season");}}}