class Test
{
	public void main(String[] args)
	{
		B b = new B();
		b.M1();
		b.M2();
		b.M3();

		C c = new C();
		c.M4();
		c.M5();	
	}
}
abstract class A
{
	public void M1()
	{
		System.out.println("hlo");
	}
	public void M2()
	{
		System.out.println("hey");
	}
	public  abstract void M3();
}
class B	extends A
{
	public void M3()
	{
		System.out.println("java");
	}
}
interface I
{
	public void M4();
	public void M5();
}
class C implements I
{
	public void M4()
	{
		System.out.println(".net");
	}
	public void M5()
	{
		System.out.println("Python");
	}
}	