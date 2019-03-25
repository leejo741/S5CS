import java.util.*;

public class MySavings // penny, nickel, dime, quarter
{
	public static void main (String[] args)
	{
		
		double selection;
		
		Scanner inp = new Scanner(System.in);
		
		PiggyBank john = new PiggyBank(0);
		
		int flag = 1;
		
		while (flag == 1)
		{
			System.out.println("Enter a number between 0 and 6: ");
			
			selection = inp.nextDouble();
			
			if(selection == 1)//shows total in bank account
			{
				System.out.println("Your balance is: " + john.getBalance());
				
				selection = -1;
				
			}
			
			if(selection == 2)
			{
				double penny = 0;
				System.out.println("How many pennies would you like to deposit?");
				
				penny = inp.nextDouble();
				
				john.addPenny(penny);
				
				selection = -1;
				
			}
			
			if(selection == 3)
			{
				double nickel = 0;
				System.out.println("How many nickels would you like to deposit?");
				
				nickel = inp.nextDouble();
				
				john.addNickel(nickel);
				
				selection = -1;
			}
			
			if(selection == 4)
			{
				double dime = 0;
				System.out.println("How many dimes would you like to deposit?");
				
				dime = inp.nextDouble();
				
				john.addDime(dime);
				
				selection = -1;
			}
			
			if(selection == 5)
			{
				double quarter = 0;
				System.out.println("How many quarters would you like to deposit?");
				
				quarter = inp.nextDouble();
				
				john.addQuarter(quarter);
				
				selection = -1;
			}
			
			if(selection == 6)
			{
				double total = 0;
				
				System.out.println("How much money would you like to withdraw?");
				
				total = inp.nextDouble();
			
				john.takeMoney(total);
				
				System.out.println("Your remaining balance is: " + john.getBalance());
			}
			
			if(selection == 0)
			{
				flag = 0;
			}
			

			
			
			
			
		
		}
	}
		
}

class PiggyBank
{
	private double balance;
	
	public PiggyBank(double total)
	{
		total = balance;
	}
	
	public double getBalance()					
	{
		return(balance);
	}
	
	public void addPenny(double total)
	{
		balance = balance + (0.01*total);
	}
	
	public void addNickel(double total)
	{
		balance = balance + (0.05*total);
	}
	
	public void addDime(double total)
	{
		balance = balance + (0.10*total);
	}
	
	public void addQuarter(double total)
	{
		balance = balance + (0.25*total);
	}
	
	public void takeMoney(double total)
	{
		balance = balance - total;
	}
	
	
}