//multidimensional array 
class threethree
{
public static void main (String args [])
{
int aman[][]={{8,9,10,11},{12,13,14,15}};
int aman2[][]={{1,2,3,4},{27},{20,21,22}};
System.out.println("This is the first array");
display(aman);
System.out.println("This is the second array");
display(aman2);
}
public static void display(int x[][])
{
for(int R=0;R<x.length;R++)
{
for(int C=0;C<x[R].length;C++)
{
System.out.print(x[R][C]+"\t");
}
System.out.println();
}
}
}