class fourThreeb
{
private String name;
private fourTwob birthday;
public fourThreeb(String theName,fourTwob theDate)
{
name = theName ;
birthday = theDate;
}
public String toString()
{
return String.format("My name is %s ,My birthday is %s",name , birthday);
}
}
