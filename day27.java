//String 
class Test
{
	public static void main(String[] args)
	{
		String S1 = new String("Crunchy");
		String S2 = new String("Crunchy");
		S1.concat("Teja");
	
		StringBuffer SB1 = new StringBuffer("charan");
		StringBuffer SB2 = new StringBuffer("charan");

		System.out.println(S1==S2);
		System.out.println(S1.equals(S2));
		
		System.out.println(SB1==SB2);
		System.out.println(SB1.equals(SB2));
		
		System.out.println(S1+SB1);
		
	}
}

	