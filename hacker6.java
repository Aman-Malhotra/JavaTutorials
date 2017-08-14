
import java.util.Scanner;

public class hacker6
 {

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        System.out.println(A.length()+B.length());
        char A1=A.charAt(0),B1=B.charAt(0);
        int a=(int)A1,b=(int)B1;
        if(a<b)
            System.out.println("No");
        else
            System.out.println("Yes");
        System.out.print((char)(a-32)+A.substring(1,A.length())+" ");
        System.out.print((char)(b-32)+B.substring(1,B.length()));
        
     
    }
}
