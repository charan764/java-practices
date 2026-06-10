class day13
{
	public void main(String[] args)
	{
		Z a = new Z();
		Z a1 = new Z(10);
		Z a2 = new Z("String");
		B b = new B();
		B b1 = new B(20);
		a.M1();
	}
}
class Z
{
	Z()
	{
		this(10);
		System.out.println("hi");

	}
	Z(int x)
	{
		System.out.println("hello");
	}
	Z(String x)
	{
		System.out.println("java");
	}	
	
	public void M1()
	{
		System.out.println("hey");
	}
}
class B extends A
{
	B()
	{
		super(20);
		System.out.println(".net");
	}
	B(int x)
	{
		System.out.println("python");
	}
}