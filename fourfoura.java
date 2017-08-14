// enumeration
import java .util.EnumSet;
class fourfoura
{
public static void main()
{
for (fourfourb people:fourfourb.values())
{
System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getYear());
}
System.out.println("\nAnd now for the range of constants !!!\n");
for (fourfourb people : EnumSet.range(fourfourb.aman,fourfourb.arjun))
{
System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getYear());
 }
}

}
