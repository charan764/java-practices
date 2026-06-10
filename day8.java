class Day8
{
	public static void main(String[] args)
	{
	 	parent p = new parent();
			p.C1();
			p.C2();
			p.C3();

		child a = new child();
			a.C1();
			a.C2();
			a.C3();
			a.C4();
		parent p2= new child();
			p2.C1();
			p2.C2();
			}
}
	
class parent
{
	public void C1()
	{
		System.out.println("chocolate");
	}
	public void C2()
	{
		System.out.println("is very");
	}
	public void C3()
	{
		System.out.println("CRUNCHY");
	}
}
class child extends parent
{
	public void C4()
	{
		System.out.println("But");
	}
	public void C5()
	{
		System.out.println("I love crunchy");
	}
	public void C3()
	{
		System.out.println("SOUR");
	}
}