import java.io.*;
class day18
{
	public static void main(String[] args)
	{
		try{
			File f =  new File("C:\\Users\\Dell\\Desktop\\besant-java\\Crunchy\\java.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
		   }
	      catch(Exception e)
		   {

			System.out.println("ERROR/CRASH");
		
		   }
	}
}

		