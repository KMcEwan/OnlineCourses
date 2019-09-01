import acm.program.*;

public class Chap3Ex2 extends ConsoleProgram
{
	public void run()
	{
		println("Interest calculation program");
		double startingBal = readDouble("Enter starting balance : ");
		double interest = readDouble("Enter intrest rate : ");
		double interestAmount = (startingBal / 100) * interest;
		double balance = startingBal + interestAmount;
		double interestAmount2Year = (balance /100) * interest;
		double balance2Year = balance + interestAmount2Year;
		println("Balance after one year = " + balance);
		println("Balance after two year = " + balance2Year);
	}
	
	
}