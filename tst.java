import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class tst

    {
    public static void main(String[] args) 
    {
        System.out.println("H");
        Scanner in = new Scanner(System.in);
        int c1 = in.nextInt();
        int c2 = in.nextInt();
        int h1 = in.nextInt();
        int h2 = in.nextInt();
        int least,max;
int x=0,y=0,a=0,b=0,centre1,centre2;
        if(c1<=c2){
    least=c1;
++x;
}
        else
            {
          least = c2;
        ++y;
        }
        if(h1<=h2)
        {
            max=h2;
        ++a;
        }
        else 
    {
            
            max=h1;
        ++b;
        }
        if(x==1)
            centre1=c2;
        else
            centre1=c1;
        if(a==0)
            centre2=h1;
        else 
            centre2=h2;
        if(centre1>=least&&centre2<=max)
            System.out.println("YES");
        else
            System.out.println("NO");
    
}
}
