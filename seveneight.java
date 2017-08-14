import java.io.*; 

class seveneight 
{ 
public static void main(String args[])
{
File x = new File("F:\\Aman\\aman.txt");

if(x.exists())
System.out.println(x.getName()+ " exists!!");
else 
System.out.println("This thing does not exist ");

}
}


