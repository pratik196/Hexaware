class A
{
	static int a = 1000;
	static void abc()
	{
		System.out.println("Hi ABC");
	}
}

class Demo4
{
	public static void main(String aargs[])
	{
		A.abc();
		System.out.println(A.a);
	}

}