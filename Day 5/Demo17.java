import java.util.*;

public class Demo17
{
	public static void main(String args[])
	{
		LinkedList a=new LinkedList();
		a.add(100);
		a.add(200);
		a.add(700);
		a.add(4.99);

		Iterator i = a.iteration();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}