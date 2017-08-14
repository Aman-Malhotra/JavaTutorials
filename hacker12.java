import java.io.*;
import java.util.*;

public class hacker12
{
    public static void main(String[] args) {
    System.out.println("Hellio");
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
       static boolean isAnagram(String a, String b) {
       int end=0,c1,c2,c=0,d=0;
           for(int i=65;i<=90;i++){
           
           for(int x=0;x<a.length();x++)
            {
                c1=(int)a.charAt(x);
                if(c1==i||c1==(i+32))
                c++;
            }
           for(int y=0;y<b.length();y++)
            {
                c2=(int)b.charAt(y);
                if(c2==i||c2==(i+32))
                d++;
            }
            
            if(c!=d)
           
            {
                end=1;
                break;
            }
            c=0;d=0;
    }
    if(end==1)
    return false;
    else
    return true;
    
}
}
