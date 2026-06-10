class day6
{
 
	public static void main(String[] args)
	{
		title a= new title();
		a.A1();
	}
}
class title
{
	public void A1()
	{
		String s ="Sting like a BEE";
		A2(200,10);
		System.out.print(s);
		A2("transformer");
		A2();				
	}

	public void A2(int x, int y)
	{
		System.out.println(x/y);
	}

	private void A2(String S)
	{
		System.out.println("\n\t"+"BumbleBee" +S);
	}
	public void A2()
	{
		System.out.println("avenegersss....assemble");
	}
}
		