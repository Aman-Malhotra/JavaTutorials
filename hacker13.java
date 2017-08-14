import java.io.*;
import java.util.*;

public class hacker13 {

    public static void main(String[] args) {
        System.out.println("hello");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s=s1.trim();
       String delims = "[ !,?._'@]+";
       String[] str= new String[4000000];
       if(s.length()!=0){
           
        str = s.split(delims);
    
    System.out.println(str.length);
    for(int a=0;a<str.length;a++)
      {    
      System.out.println(str[a]);
    }
}
else
System.out.println("0");
  
}
}

