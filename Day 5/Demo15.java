import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class Demo15
{
	public static void main(String args[])
	{
		ArrayList a=new ArrayList();
		a.add(19);
		a.add("p");
		a.add(true);
		a.add(15.9);
		a.add("abc");
		a.add(new Thread());

		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.remove(1));
		System.out.println(a);
		System.out.println(a.contains(400));
		System.out.println(a.isEmpty());
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}

		Iterator i = a.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}