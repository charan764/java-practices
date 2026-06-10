import java.lang.reflect.*;
class Test
{
	public static void main(String[] args)
	{
		C c = new C();
		c.m1();
		Class a = c.getClass();
		Class a1 = String.class;
		Class a2 = Object.class;
		Class a3 = System.class;
		
		System.out.println(a.getName());
		Method[] methods = a.getDeclaredMethods();
		int main = 10;
		for(Method m:methods){
			System.out.println(m);
		}
		
	}
}
class C
{
	public void m1()
	{
		System.out.println("Crunchy");
	}
	public void m2()
	{
		System.out.println("Charan");
	}
	public void m3()
	{
		System.out.println("Max");
	}
}

