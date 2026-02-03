import java.util.Scanner;
class PowerNumber{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
			int number=s.nextInt();
			int power=s.nextInt();
			int i;
			int result=1;
			for(i=1;i<=power;i++){
			result=result*number;}
			System.out.println(result);}}