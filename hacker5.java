import java.util.Scanner;
class hacker5
{

public static Scanner aman= new Scanner (System.in);
static int B=aman.nextInt();
static int H=aman.nextInt();
static boolean flag = B>0&&H>0;
static 
{
if(B<0||H<0)
{
System.out.println("java.lang.Exception: Breadth and height must be positive");
}
}
public static void main(String args[])
{
if(flag)
{
int area =B*H;
System.out.println(area);
}
}
}
