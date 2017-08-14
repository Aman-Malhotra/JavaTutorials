//variable length arguments 
import java.util.Scanner;
class threefive
{
public static void main(String args[])
{
Scanner aman= new Scanner (System.in);
System.out.println("Enter the number of items u want to get the average of");
int x=aman.nextInt();
System.out.println("Enter the numbers u want to get the average of");
int c[]=new int[x];


for (int i=0;i<x;i++)
{
c[i]=aman.nextInt();
}
System.out.println("The average is:"+average(c));
}
public static double average(int...numbers)
{
int total=0;
for(int x:numbers)
total+=x;
return total/numbers.length;
}
}
