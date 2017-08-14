import java.util.Scanner;
public class hacker3 {
 public static void main(String[] args) {
     System.out.println("hello");
     Scanner aman= new Scanner (System.in);
     int input = aman.nextInt();
     String str="";
     str = Integer.toString(input);
if (input == Integer.parseInt(str)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } 
}