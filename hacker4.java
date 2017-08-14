import java.util.Scanner;
class hacker4
{
public static void main(String args[])
{
System.out.println("prog starts ");
Scanner aman= new Scanner (System.in);
int q = aman.nextInt();
String str[] = new String[q];
aman.nextLine();
String numberStr[] = new String[3];
int a=0,b=0,n=0;
int s;
for (int x=0;x<q;x++)
{
str[x] = aman.nextLine();
numberStr=str[x].split(" ");
for(int getNmb=0;getNmb<3;getNmb++)

switch(getNmb) {
case 0:
a=Integer.parseInt(numberStr[getNmb]);
break;
case 1:
b=Integer.parseInt(numberStr[getNmb]);
break;
case 2:
n=Integer.parseInt(numberStr[getNmb]);
break;
default:
System.out.print("");
}
s=a;
for(int formula =0;formula <n;formula++)
{
s+=Math.pow(2,formula)*b;
System.out.print(s+" ");
}
}
}
}
