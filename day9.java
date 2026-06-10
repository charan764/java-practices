class Day9
{
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		a.M1(b);
		b.M2();
		b.M3();
		
	}
}

class A
{
	public void M1(B b)
	{
		System.out.println("hlo");
	}
	public void M2()
	{
		System.out.println("java");
	}

}
class B extends A
{
	public void M2()
	{
		System.out.println("hey");
	}
	public void M3()
	{
		System.out.println(".net");
		C c = new C();
		c.M4();
	}
}
class C
{

	public void M4()
	{
		System.out.println("Python");
	}
}

