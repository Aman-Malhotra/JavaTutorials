import java.util.Scanner;
public class twoone
{
public static void main()
{
Scanner aman = new Scanner(System.in);
int total=0;
int grade;
int average;
int counter=0;
System.out.println("Enter the marks :");
while (counter < 5)
{
grade = aman.nextInt();
total = total + grade;
counter++;
}
average = total/10;
System.out.println("The average is:"+average);
}
}
