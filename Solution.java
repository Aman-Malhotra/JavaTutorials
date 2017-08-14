import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
                System.out.println("Hello");
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        StringBuffer aman= new StringBuffer(A);
        aman.reverse();
        String C= aman.toString();
        System.out.println(C);
        System.out.println(A);
        if(C.equals(A))
            System.out.println("Yes");
        else
            System.out.println("No");
       
        
    }
}