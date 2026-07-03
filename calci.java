class Basic
{
	public static void main(String[] args)
	{
		Basic b = new Basic();
		b.add(20,30);
		b.sub(10,5);
		b.multi(10,5);
		b.div(10,5);			

	}
	
	public void add(int x, int y)
	{

		System.out.println(x+y);
	
	}
	public void sub(int z,int m)
	{
	
		System.out.println(z-m);
			
	}
	public void multi(int n,int o)
	{

		System.out.println(n*o);
				
	
	}
	public void div(int p,int q)
	{

		System.out.println(p/q);
		

	}

}