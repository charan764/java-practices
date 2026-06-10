class day7
{
	public static void main(String[] args)
	{
		Planets1 f = new Planets1();
		f.M3();
		f.M1(10);
		f.M2(10,30);
		
		Planets2 d = new Planets2();
		d.M5();
		d.M4();
		d.M3();
		d.M2(10,30);
		d.M1(10);
		}
}
class Planets1
{
	public void M1(int x)
	{
		System.out.println(".....Earth......");
	}
	public void M2(int x, int y)
	{
		System.out.println("Mars");
	}
	public void M3()
	{
		System.out.println("Venus");
	}
}
class Planets2 extends Planets1
{
	public void M4()
	{
		System.out.println("Neptune");
	}
	public void M5()
	{
		System.out.println(".....Pluto....");
	}
}