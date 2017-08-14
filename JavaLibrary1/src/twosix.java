//creating a random variable
import java.util.Random;
class twosix
{
public static void main()
{
Random dice=new Random();
int number;
for(int counter=1;counter<=10;counter++)
{
number = 1+dice.nextInt(6);
System.out.println("Number "+number);
}
}
}