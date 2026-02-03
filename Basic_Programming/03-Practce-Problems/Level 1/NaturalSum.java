import java.util.Scanner;
class NaturalSum {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int sum=0;
int number=s.nextInt();
for(i=0;i<=n;i++){
sum=sum+i;}
int nat=number*(number+1)/2;
if(nat==sum){
System.out.println(sum);}
else { System.out.println("Not Same");}}}