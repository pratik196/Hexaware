import java.util.*;

class Demo18
{
	public static void main(String args[])
	{
		Stack a = new Stack();
		a.push("1");
		a.push("2");
		a.push("3");
		a.push("4");
		a.push("5");
		a.push("6");

		System.out.println(a);
		System.out.println(a.pop());
		//System.out.println(a.peek);

		System.out.println(a.search("555"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}
}