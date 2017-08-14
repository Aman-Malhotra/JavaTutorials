//array in methods
class threetwo 
{
public static void main(String args[])
{
int aman[]={1,2,3,4,5};
change(aman);
System.out.println("New Array");
for(int y:aman)
{
System.out.println(y);
}
}
public static void change(int x[])
{
for(int a=0;a<x.length;a++)
{
x[a]+=5;
}
}
}
