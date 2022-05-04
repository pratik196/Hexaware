import java.util.*;

class Demo19
{
	public static void main(String args[])
	{
		TreeMap map = new TreeMap();
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
		map.put(4,"d");
		map.put(5,"e");

		Set i = map.entrySet();
		Iterator i1 = i.iteratior();

		while(i1.hasNext())
		{
			Map.Entry entry=(Map.Entry)i1.next();
			System.out.println(entry.getKey()+""+entry.getValue());
		}
	}
}