class fivefive
{
public static void main(String args[])
{
food aman[]= new food[2];
aman[0]= new potpie();
aman[1]= new tuna();
for(int x=0;x<2;x++)
{
aman[x].eat();
}
}
}