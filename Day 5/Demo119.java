import java.util.*;

class Demo119
{
	public static void main(String args[])
	{
	TreeSet a = new TreeSet();
	a.add(100);
	a.add(200);
	a.add(700);

	Iterator i = a.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	}
}