class Test
{
	public void main(String args[])
	{
		A a = new A();
		B b = new B();
		b.M1();
	}
}
	
class A
{
	A()
	{	
			this(20);
		System.out.println("java");
	}
	{
		System.out.println("Python");
	}
	A(int x)
	{	
		System.out.println(".net");
	}
}
class B extends A
{
	B()
	{	
			this("hlo");
		System.out.println("Spring");
	}
	B(String y)
	{	
		System.out.println("LOW");
	}
	public void M1()
	{
		System.out.println("instance");
	}
}