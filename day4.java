class  day4
{

    public static void main(String[] args)
    {
      Methods t= new Methods();
      t.c3(4.5);
      t.c4(11f);
      t.c2("Fight");
      t.c1(17);
      t.c5(20,13f);
    }
}
class Methods
{
    public void c1(int x)

    { 
       System.out.println(x);
    }
    public void c2(String e)
    {
       System.out.println("Optimus Prime");
    }
    public void c3(double d)
    {
       System.out.println(d);
    }
    public void c4(float f)
    {
       System.out.println(f);
    }
    public void c5(int y,float s)
    {
       System.out.println(y);
       System.out.println(s);
    }
   
}



