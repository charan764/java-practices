class day16
{ 
	public void main(String[] args)
	{
		N a = new N();
		a.M1();
		a.M2();
	}
}

interface I1
{
	final int x =30;
	public void M1();
	public void M2();
}
interface I2
{
	int y = 40;
	public void M1();
	public void M2();
}
class N implements I1,I2
{
	public void M1()
	{	
		System.out.println(I1.x);
	}
	public void M2()
	{
		System.out.println(I2.y);
	}
	
}
	
	