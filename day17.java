class Test
{
	public static void main(String[] args)
	{
		System.out.println();
		C c = new C();
		c.M1(20,0);	
	}
}
class C
{
	public void M1(int x, int y)
	{
		System.out.println(x-y);
		
		try
		   {
			System.out.println(x/y);
			
		   }	

	
		catch(ArithmeticException e)
		    {
			System.out.println("Crunchy/Crash");
		    }
	}
}	

	