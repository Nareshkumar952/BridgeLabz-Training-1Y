import java.util.Scanner;
class Feets{
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int feet=s.nextInt();
	double cm=feet*30.48;
	double inch=cm/0.39;
System.out.println("Your Height in cm is"+cm +"while in feet is"+ feet + "and Inches"+ inch);}}