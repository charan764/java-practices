
class Crunchy {
    public static void main(String[]args)throws ClassNotFoundException,InstantiationException,IllegalAccessException{
	String ClassName = args[0];
        Class z = Class.forName(ClassName);
        I i =(I) z.newInstance();
        
        i.m1();
    }
}
interface I {
    public void m1();
}
class A implements I{
    public void m1(){
        System.out.println("Crunchy");
    }
}
class B implements I{
    public void m1(){
        System.out.println("Charan");
    }
}
class C implements I{
    public void m1(){
        System.out.println("Pavani");
    }
}
class D implements I{
    public void m1(){
        System.out.println("Lokesh");
    }
}

