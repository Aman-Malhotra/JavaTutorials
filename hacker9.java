import java.math.*;
import java.util.*;
import java.io.*;
import java.lang.*;
class hacker9
{
public static void main(String args[])
{
System.out.println("Hello");
Scanner aman = new Scanner(System.in);
int N= aman.nextInt();
aman.nextLine();
String str[]= new String[N]; 
for(int a =0;a<N;a++)
{
str[a]=aman.nextLine();
}
int Q= aman.nextInt();
String Qu[]=new String[Q]; 
aman.nextLine();
for(int x=0;x<Q;x++)
{
Qu[x]=aman.nextLine();
}
int count =0;
for(int check = 0;check<Q;check++)
{
for(int i=0;i<N;i++){
if(Qu[check].equals(str[i]))
{
count++;
}
}
System.out.println(count);
count=0;
}
}
}






