import java.util.Scanner;
class Fees {
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int fee=s.nextInt();
	double dp=s.nextDouble();
	double d=dp/100;
	double final=fee- d;
	System.out.println("The discount amount INR"+d+"Final discounted fee INR"+ final);}}