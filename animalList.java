class animalList
{
private animals[] theList= new animals[5];
private int i =0;
public void add (animals a)
{
if(i<theList.length)
{
theList[i]= a;
System.out.println("Animal added at index "+i);
i++;
}
}
}
 