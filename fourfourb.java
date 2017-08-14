public enum fourfourb
{
 aman("nice","19"),
 arjun("angry","16"),
 aanchal("loud","22");
 private final String desc;
 private final String year;
 fourfourb(String description , String birthday)
 {
  desc = description;
  year = birthday;
}
public String getDesc()
{
return desc;
}
public String getYear()
{
return year;
}
}
