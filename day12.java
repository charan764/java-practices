class day12
{
	public static void main (String[] args)
	{
		Bike b1 = new Bike();
		b1.setId(1234);
		b1.setName("DUKE");
		b1.setModel(200);
		b1.setType("SPORTS BIKE");
		b1.setMyear(2019);
		
		
		
		int idb1 = b1.getId();

		String nameb1 = b1.getName();


		int modelb1 = b1.getModel();


		String typeb1 = b1.getType();


		int myear = b1.getMyear();
		
		        System.out.println("Bike ID: " + idb1);
        		System.out.println("Bike Name: " + nameb1);
        		System.out.println("Model: " + modelb1);
        		System.out.println("Type: " + typeb1);
        		System.out.println("Manufacturing Year: " + myear);
    

		
				
	}
}
class Bike
{
	int id;
	String name;
	int model;
	String type;
	int myear;
	
	public void setId(int Id)
	{
		this.id = Id;
	}
	public void setName(String Name)
	{
		this.name = Name;
	}
	public void setModel(int Model)
	{
		this.model = Model;
	}
	public void setType(String Type)
	{
		this.type = Type;
	}
	public void setMyear(int Myear)
	{
		this.myear = Myear;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getModel()
	{
		return model;
	}
	public String getType()
	{
		return type;
	}
	public int getMyear()
	{
		return myear;
	}

}