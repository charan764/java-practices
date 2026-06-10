class day14b
{
	public static void main(String[] args)
	{
		Emp e1 = new Emp(123,"charan");
		Emp e2 = new Emp(456,"Crunchy");
		
		e1.printEmpDetails();
		e2.printEmpDetails();
	
	
	}
}
class Yellow
{
	int id;
	String name;
	 
	Yellow(int i,String n)
	{
		id=i;
		name = n;
	}
	public void printEmpDetails()
	{
		System.out.println("Id:"+ id +",NAME:"+ name);
	}
	
}
	
	
	

