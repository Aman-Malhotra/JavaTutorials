//array elements as counters
import java.util.Random;
class threezero
{
public static void main()
{
Random aman = new Random();
int freq[]=new int[7];
for(int counter=1;counter<=1000;counter++)
{
freq[1+aman.nextInt(6)]=freq[1+aman.nextInt(6)]+1;
}
System.out.println("Face\tfrequency"); 
for (int a=1;a<freq.length;a++)
{
System.out.println(a+"\t"+freq[a]);
}
}
}
