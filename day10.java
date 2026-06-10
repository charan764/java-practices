class Day10
{
	public static void main(String[] args)
	{
		A  a = new A();
		B  b = new B();
		C  c = new C();
		c.M2(b);
		System.out.println("Program has been executed");
		
	}
}

class A
{
	public void M1(int x)
	{
		System.out.println(x*3);	
	}
}
class B extends A
{
	public void M2(int x,int y)
	{
		System.out.println(x*y);
		
	}
}
class C extends B
{
	public void M2(B b)
	{
		b.M1(10);
		b.M2(20,30);
		System.out.println("JAVA");
	}
}
