class A
{
	int x = 100;
	A()
	{
	
	}
}

class Demo3
{
	public static void main(String aargs[])
	{
		A a = new A();
		B b = new B();
		System.out.println(a.x);
		a.x = 1000;
		System.out.println(a.x);
		a = null;
		b = null;
		System.gc();
	}

}