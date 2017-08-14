// enhanced for loop
class threeone
{
public static void mian()
{
int aman[] = {3,4,5,6,7};
int total=0;
int a=0;
for(int x:aman)
{
if(a<4)
System.out.print(x+"+");
else
System.out.print(x);
total+=x;
a++;
}
System.out.println("="+total);
}
}
