import java.math.*;
import java.io.*;
import java.util.*;
class hacker10
{
public static void main(String args[])
{
System.out.println("Hello");
Scanner aman = new Scanner(System.in);
int N = aman.nextInt();
int M = aman.nextInt();
int array[]= new int[N];
int a,b,k;
for(int input=0;input<M;input++)
{
a=aman.nextInt();
b=aman.nextInt();
k=aman.nextInt();
for(int update=(a-1);update<b;update++)
{
array[update]+=k;
}
}
int maxSum=0;
for(int v=0;v<N;v++)
{
if(array[v]>maxSum)
maxSum = array[v];
}
System.out.println(maxSum);
}
}
  