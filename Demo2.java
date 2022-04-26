import java.util.Scanner;
class A
{
	A()
	{
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter ID: ");
		int id = sc.nextInt();

		System.out.print("Enter name: ");
		String name = sc.next();

		System.out.print("Enter age: ");
		int age = sc.nextInt();


		System.out.print("Enter salary: ");
		int salary = sc.nextInt();

		System.out.print("Enter designation: ");
		String designation = sc.next();

		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+designation);
	}
}



class Demo2
{
	public static void main(String args[])
	{
		A a = new A();
		
	}
}