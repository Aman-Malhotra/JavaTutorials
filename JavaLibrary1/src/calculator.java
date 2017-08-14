import java.util.Scanner;
class calculator 
{
	public static void main (String args[])
	{
		Scanner aman = new Scanner(System.in);
		double fnum , snum, answer;
		System.out.println("Enter first num:-");
		fnum = aman.nextDouble();
	    System.out.println("Enter second  num:-");
		snum = aman.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}
