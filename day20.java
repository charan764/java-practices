import java.util.*;
class Threads
{
	public static void main(String[] args)
	{
		Thread mt= Thread.currentThread();
		mt.setPriority(Thread.MIN_PRIORITY);
		Thread t1 = new CustomThread(mt);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		for(int i=0;i<6;i++)
		{
			System.out.println("Crunchy"+Thread.currentThread().getName());
		}

		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			System.out.println("The code has Been Wrong");
		}
	
	
	}
}
class CustomThread extends Thread
{
	Thread mt;
	CustomThread(Thread mt)
	{
		this.mt=mt;
	}
	public void run()
	{
		try
		{
			mt.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("your code has some Error");
		}
		for(int i=0;i<6;i++)
		{
			System.out.println("Crunchy  "+Thread.currentThread().getName());
		}
	}
}