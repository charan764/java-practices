import java.io.*;
class day21
{
	public static void main(String[] args)
	{
		BankAccount bankAccount=new BankAccount();
		Thread cardPaymentThread = new CardPayment(bankAccount,"Your Account has been Debited through CardPayment");
		cardPaymentThread.start();
		Thread upiPaymentThread =new UpiPayment(bankAccount,"Your Account has been Debited through UPI Payment");
		upiPaymentThread.start();
		Thread mobileBankingThread = new MobileBanking(bankAccount,"Your Account has been Debited through MobileBanking");
		mobileBankingThread.start();	
	
	}
}
class CardPayment extends Thread
{
	BankAccount bankAccount;
	CardPayment(BankAccount bankAccount,String name)
	{
		super(name);
		this.bankAccount= bankAccount;
	}
	public void run()
	{
		bankAccount.withdrawAmount(10000);
	}

}
class UpiPayment extends Thread
{
	BankAccount bankAccount;
	UpiPayment(BankAccount bankAccount,String name)
	{
		super(name);
		this.bankAccount= bankAccount;
	}
	public void run()
	{
		bankAccount.withdrawAmount(15000);
	}
}
class MobileBanking extends Thread
{
	BankAccount bankAccount;
	MobileBanking(BankAccount bankAccount,String name)
	{
		super(name);
		this.bankAccount=bankAccount;
	}
	public void run()
	{
		bankAccount.withdrawAmount(25000);
	}

}
class BankAccount
{
	int totalBalance = 50000;
	public synchronized void withdrawAmount(int amount)
	{
		if(totalBalance >= amount)
		{
			totalBalance = totalBalance - amount;
			System.out.println(Thread.currentThread().getName()+" succesfully debited for Rs- $"+amount+" and the Total Balance is $ "+totalBalance);
		}
		else
		{
			throw new InsufficientBalanceException(Thread.currentThread().getName()+" is unsuccessful due to Insufficient balance");
		}
		System.out.println("Total Balance = "+totalBalance);
	}
}
class InsufficientBalanceException extends RuntimeException
{
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
		
		
	