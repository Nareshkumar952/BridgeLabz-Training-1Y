import java.util.Scanner;
class WhilePowerNumber{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
			int number=s.nextInt();
			int power=s.nextInt();
			int i;
			int result=1;
while(i<=power){
result=result*power;
i++;}
System.out.println(result);}}