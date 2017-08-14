import java.math.*;
import java.util.Scanner ;
class prog
    {
    public static void main(String args[])
        {
        System.out.println("prog started");
        Scanner aman = new Scanner (System.in);
        int n = aman.nextInt();
        long input[]= new long[n];
        
        int check=0;
        for (int count=0;count<n;count++)
        {
            input[count]=aman.nextLong();
        }
        for (int test =0;test<n;test++)
            {
        
            if (input[test]>-128 && input[test]<127)
        {   
            System.out.println(input[test]+" can be fitted in:");
            System.out.println("* byte");
            check++;
        }
        else 
        
            System.out.print("");
        if(input[test]>-32768 && input[test]<32767 )
        {
            if(check==0)
            System.out.println(input[test]+" can be fitted in:");
            System.out.println("* short");
            check++;
        }
        else 
        
            System.out.print("");
        if(input[test]>-2147483648 && input[test]<2147483647 )
        {
            if(check==0)
            System.out.println(input[test]+" can be fitted in:");
            System.out.println("* int");
            check++;
        }
        else 
        
            System.out.print("");
            if (input[test]>Math.pow(-2,63) && input[test]<(Math.pow(2,63)-1))
        {   
            if(check==0)
            System.out.println(input[test]+" can be fitted in:");
            System.out.println("* long");
            check++;
        }
        else
             System.out.print("");
        
        if (check==0)
            System.out.println(input[test]+" can't be fitted anywhere.");
               
            
        else 
            System.out.print("");
         check=0;
            }
      }
}
