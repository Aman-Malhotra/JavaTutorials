//exception handling 
import java.util.*;
class eighttwo 
{
public static void main(String args[])
{
Scanner aman = new Scanner (System.in);
int x=1;
do{
try{
System.out.println("Enter first num");
int num1 = aman.nextInt();
System.out.println("Enter second  num");
int num2 = aman.nextInt();
int sum= num1/num2;
System.out.println(sum);
x=2;
}
catch(Exception e)
{
System.out.println("You cant do that ");
}
}
while (x==1);
}
}
