import java.io.*;
class Test
{
	public static void main(String[] args)
	{
		Any b = new Any();
		b.M1();
	}
}
class Any
{
	public void M1()
	{
		try(BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\Dell\\Desktop\\besant-java\\Crunchy\\java.txt"))))
			{
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				System.out.println(br.readLine());
			}
		catch(IOException IO)
			{
				System.out.println("file Doesn't exist,check again and again");
			}
		finally
			{
				System.out.println("finally always print the output if file exist or doesn't also");
			}
	}
}
		