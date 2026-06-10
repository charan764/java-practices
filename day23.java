class Test
{
	public static void main(String[] args)
	{
		Code c = new Code();
		Code c1 = new Code();
		Code c2 = new Code();
		c.M1(20);
		System.out.println(c.hashcode("crunchy"));
		System.out.println(c1.hashcode("Charan"));
		System.out.println(c2.hashcode("java"));

		
	}
}
class Code
{
	public void M1(int x)
	{
		System.out.println("Hashcode program");
	}
	public int hashcode(String y)
	{
		System.out.println("overriding hashcode method");
		return 46;
	}
}
