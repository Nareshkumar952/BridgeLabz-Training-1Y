import java.util.Scanner;
class Simpleinterest {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int  r=s.nextInt();
		int p=s.nextInt();
		int t =s.nextInt();
		double SI=(p*r*t)/100;
      System.out.println(SI);
 }
 } 