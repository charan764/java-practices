class Test
{
	public static void main(String[] args)
	{
		System.out.println();
		A a = new B();
		a.m1();
		a.m2();		
	}
}

class A
{
	public static void m1()
	{
		System.out.println("hii");
	}
	public  void m2()
	{
		System.out.println("hello");
	}
}
class B extends A
{
	public static void m1()
	{
		System.out.println("hey");
	}
}