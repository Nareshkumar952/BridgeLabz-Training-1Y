package String_Assignment;
import java.util.Scanner;
class CompareTwoStrings {
    public static void main(String args []) {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        String sr=s.next();
     for(int i=0;i<st.length();i++){
         if(st.charAt(i)==sr.charAt(i)){
             System.out.println("true");
         }
     }
       System.out.println(st.equals(sr));
    }
}
