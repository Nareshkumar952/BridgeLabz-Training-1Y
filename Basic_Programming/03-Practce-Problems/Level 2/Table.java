import java.util.Scanner;
class Table {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int i;
if(a>=6&&a<=9){
for(i=1;i<=10;i++){
System.out.println(a*i);}}
else{
System.out.println("Number not in Range");}}}