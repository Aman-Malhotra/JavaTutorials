import java.util.Scanner;
class sixteena
{
public static void mian()
{
Scanner input = new Scanner (System.in);
System.out.print("Enter he name of yout first gf:");
String name = input.nextLine();
sixteenb tuna = new sixteenb();
tuna.setName(name);
tuna.saying();
}
}

