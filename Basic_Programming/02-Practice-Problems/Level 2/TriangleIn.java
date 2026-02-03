import java.util.Scanner;
class TriangleIn{
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	double area=(a*b)/2;
	double inch=area*2.54*2.54;
System.out.println("The Area of the triangle in sq in is"+ area+ "and sq cm is"+ inch);}}