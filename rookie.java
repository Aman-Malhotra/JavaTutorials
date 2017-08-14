import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class rookie {


    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        in.nextLine();
         String t1[]=new String[1000000];
        String numberStr[]=new String[2];
        String str1,str2,str3,str4,str5,str6,str7,str8;
        int hour1,hour2,min1,min2;
        for(int a0 = 0; a0 < q; a0++)
        {
             t1[a0] = in.nextLine();
             numberStr=t1[a0].split(" ");
             
                
                str1=numberStr[0]+" ";
                str2=numberStr[1]+" ";
                
                str3=numberStr[0].substring(0,2);
                str4=numberStr[1].substring(0,2);
                str5=numberStr[0].substring(5,7);
                str6=numberStr[1].substring(5,7);
                str7=numberStr[0].substring(3,5);
                str8=numberStr[1].substring(3,5);
                hour1=Integer.parseInt(str3);
                hour2=Integer.parseInt(str4);
                
                min1=Integer.parseInt(str7);
                min2=Integer.parseInt(str8);
            if(str5.equals("AM")&&str6.equals("PM"))
            System.out.println("First");
            else if(str6.equals("AM")&&str5.equals("PM"))
            System.out.println("Second");
            else if(str5.equals(str6))
            {
                 if(str3.equals(str4))
                {
                    if(min1<min2)
                    System.out.println("First");
                    else
                    System.out.println("Second");
                }     
                else if(!str3.equals(str4))
                {
                    if(str3.equals("12")||(hour1<hour2))
                    System.out.println("First");
                    else 
                    System.out.println("Second");
                }
               
            }
      }        
}
}

