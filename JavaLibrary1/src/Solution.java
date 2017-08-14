import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner sc=new Scanner(System.in);
        String str[]=new String[3];
        String integer[]=new String[3];
             for(int i=0;i<3;i++)
            {
                str[i]=sc.nextLine();
                integer[i]=sc.nextLine();
            }
            System.out.println("================================");
       int spaceAdd,addZero,lengthCount1,lengthCount2;
        for(int x=0;x<3;x++)
            {
            lengthCount1=str[x].length();
            System.out.print(str[x]);
            for(spaceAdd=0;spaceAdd<(15-lengthCount1);spaceAdd++)
            {
             System.out.print(" ");
            }
            lengthCount2=integer[x].length();
            if(lengthCount2!=3)
            {
                for(addZero=0;addZero<3-lengthCount2;addZero++)
            {
             System.out.print("0");
            }
            System.out.print(integer[x]);
            }
            else
            System.out.print(integer[x]);
            System.out.println();
        }
        
            System.out.println("================================");

    }

}