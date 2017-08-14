import java.util.Scanner;
import java.util.*;
class hacker7
{

public static void main(String[] args) {
System.out.println("hello");
    
    Scanner scan=new Scanner(System.in);
    String str=scan.next();
    int k=scan.nextInt();
    TreeSet t= new TreeSet();
    for(int x=0;x<str.length();x++)
    {
        t.add(str.charAt(x));
        
    }
    System.out.println(t);
    System.out.println(t.first());
    System.out.println("");
    System.out.println("");
}
}