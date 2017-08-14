import java.util.Scanner;
class hacker
{
public static void main()
{
Scanner aman=new Scanner (System.in);
System.out.println("H");
String inputStr[]= new String [3];
int spaceIndex,length1,length2,spaceAdd,addZero;
String str1="";
String str2="";
for(int i=0;i<3;i++)
{
inputStr[i]=aman.nextLine();
}
System.out.println("================================");
for(int a=0;a<3;a++)
{
spaceIndex = inputStr[a].indexOf(" ");
str1=inputStr[a].substring(0,spaceIndex);
str2=inputStr[a].substring(spaceIndex+1,inputStr[a].length());
System.out.print(str1);
length1 =str1.length();
for(spaceAdd=0;spaceAdd<(15-length1);spaceAdd++)
{
System.out.print(" ");
}
length2=str2.length() ;
for(addZero=0;addZero<(3-length2);addZero++)
            {
             System.out.print("0");
            }
System.out.println(str2);
}
System.out.println("================================");
}
}