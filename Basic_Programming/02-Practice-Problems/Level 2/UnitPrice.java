import java.util.Scanner;
class UnitPrice{
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int unit=s.nextInt();
	double quant=s.nextDouble();
	double total=unit*quant;
System.out.println("The total purchase price is INR"+ total+ "if the quantity"+ quant +"and unit price is INR"+ unit);}}