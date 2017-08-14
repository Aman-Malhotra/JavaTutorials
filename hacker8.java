import java.util.*;
import java.math.*;
class hacker8
{
public static void main(String args[])
{
          System.out.println("Hello");

        Scanner in = new Scanner (System.in);
        int array[][]= new int[6][6];
        int sum[]= new int[16];
        for(int i = 0;i<6;i++)
            for(int j=0;j<6;j++)
            array[i][j]=in.nextInt();
            int k =0;
            for(int a=0;a<4;a++)
            for(int b=0;b<4;b++)
            {
                sum[k]= array[a][b]+array[a][b+1]+array[a][b+2]+array[a+1][b+1]+array[a+2][b]+array[a+2][b+1]+array[a+2][b+2];
                System.out.printf(k+"=%s ",sum[k]);
                k++;
                
            }
            k=0;
            int maxSum=-100000;
         while(k<16)
         {
               if(sum[k]>maxSum)
               maxSum= sum[k];
               k++;
            }
            System.out.println(maxSum);
        }
    }
    
