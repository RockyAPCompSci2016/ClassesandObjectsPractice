
public class SavingsAccount {
	private double balance;
	private String name;
	private double interest; 

public SavingsAccount(String n, double b, double i)
{
	balance=b;
	name=n;
	interest=i;
}
public void deposit(double depositamount)
{
	balance +=depositamount;
}
public void withdraw(double withdrawalamount)
{
	balance-=withdrawalamount;
}
public double addInterest()
{
	balance=balance*(1+interest);
	return balance;
}
public double seebalance()
{

	return balance;
}
}


