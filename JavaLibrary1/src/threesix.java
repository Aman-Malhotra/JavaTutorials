//display military time
class threesix
{
public static void main(String args[])
{
threesixb aman=new threesixb();
System.out.println(aman.toMilitary());
aman.setTime(13,27,6);
System.out.println(aman.toMilitary());
}
}