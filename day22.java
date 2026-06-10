import java.io.*;
class day22
{
	public static void main(String[] args)
	{
		Account account=new Account();
		Thread T1 = new CardPayment(account,"Your Account has been Debited through CardPayment");
		T1.start();
		Thread T2 =new UpiPayment(account,"Your Account has been Debited through UPI Payment");
		T2.start();
		Thread T3 = new MobileBanking(account,"Your Account has been Debited through MobileBanking");
		T3.start();	
		Thread T4 = new NetBanking(account,"Your Account has been Debited through NetBanking");
		T4.start();
		Thread T5 = new UserThread(account,"Your Account has been Credited by Crunchy");
		T5.start();

	}
}
class CardPayment extends Thread
{
	Account account;
	CardPayment(Account account,String name)
	{
		super(name);
		this.account= account;
	}
	public void run()
	{
		account.withdrawAmount(10000);
	}

}
class UpiPayment extends Thread
{
	Account account;
	UpiPayment(Account account,String name)
	{
		super(name);
		this.account= account;
	}
	public void run()
	{
		account.withdrawAmount(15000);
	}
}
class MobileBanking extends Thread
{
	Account account;
	MobileBanking(Account account,String name)
	{
		super(name);
		this.account= account;
	}
	public void run()
	{
		account.withdrawAmount(25000);
	}

}
class NetBanking extends Thread
{
	Account account;
	NetBanking(Account account,String name)
	{
		super(name);
		this.account= account;
	}
	public void run()
	{
		account.withdrawAmount(25000);
	}

}
class UserThread extends Thread
{
	Account account;
	UserThread(Account account,String name)
	{
		super(name);
		this.account= account;
	}
	public void run()
	{
		account.deposite(200000);
	}

}
class Account
{
	int totalBalance = 20000;
	public synchronized void withdrawAmount(int amount)
	{
		if(amount > totalBalance)
		try{
			this.wait();
		}catch(InterruptedException e){

			throw new RuntimeException(e);
		}
		else
		{
			totalBalance = totalBalance-amount;
			System.out.println(Thread.currentThread().getName()+" An withdraw Amount is  "+amount+" and the Total Balance is $ "+totalBalance);
		}
		System.out.println("Total Balance = "+totalBalance);
	}
	public synchronized void deposite(int amount)
	{
			totalBalance = totalBalance + amount;
			System.out.println(Thread.currentThread().getName()+" Credited amount is  "+amount+" and the Total Balance is $ "+totalBalance);
	
			
		this.notifyAll();
		System.out.println("Total Balance = "+totalBalance);
	}
	
}
		
		
	