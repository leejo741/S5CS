import java.util.*;

public class MySavings // penny, nickel, dime, quarter
{
	public static void main (String[] args)
	{
		
		double selection;
		
		Scanner inp = new Scanner(System.in);
		
		PiggyBank john = new PiggyBank(0);  //initializes a new piggbank object "john"
		
		int flag = 1; // will be used in the while loop to end the loop when the user decides to
		
		while (flag == 1)
		{
			System.out.println("Enter a number between 0 and 6: ");			
			
			selection = inp.nextDouble();
			
			if(selection == 1)													//shows total in bank account
			{
				System.out.println("Your balance is: " + john.getBalance());	// calls the accesor method for finding balance
				
				selection = -1; //changes the selection to -1 so that the while loop continues and the user can select another option
				
			}
			
			if(selection == 2)
			{
				double penny = 0; //initializes the variable that decides how many coins you want to deposit depending on user input
				System.out.println("How many pennies would you like to deposit?");
				
				penny = inp.nextDouble(); //gets user input for the number of coins
				
				john.addPenny(penny);//calls the mutator method to add to the balance multiplied by the number of coins
				
				selection = -1;
				
			}
			
			if(selection == 3)
			{
				double nickel = 0;//initializes the variable that decides how many coins you want to deposit depending on user input
				System.out.println("How many nickels would you like to deposit?");
				
				nickel = inp.nextDouble();//gets user input for the number of coins
				
				john.addNickel(nickel);//calls the mutator method to add to the balance multiplied by the number of coins
				
				selection = -1;
			}
			
			if(selection == 4)
			{
				double dime = 0;//initializes the variable that decides how many coins you want to deposit depending on user input
				System.out.println("How many dimes would you like to deposit?");
				
				dime = inp.nextDouble();//gets user input for the number of coins
				
				john.addDime(dime);//calls the mutator method to add to the balance multiplied by the number of coins
				
				selection = -1;
			}
			
			if(selection == 5)
			{
				double quarter = 0;//initializes the variable that decides how many coins you want to deposit depending on user input
				System.out.println("How many quarters would you like to deposit?");
				
				quarter = inp.nextDouble();//gets user input for the number of coins
				
				john.addQuarter(quarter);//calls the mutator method to add to the balance multiplied by the number of coins
				
				selection = -1;
			}
			
			if(selection == 6)
			{
				double total = 0;
				
				System.out.println("How much money would you like to withdraw?");
				
				total = inp.nextDouble();//gets user input for the amount withdrawing
			
				john.takeMoney(total); //calls mutator method that changes the balance
				
				System.out.println("Your remaining balance is: " + john.getBalance()); //calls the accessor method for the john piggybank and displays it
			}
			
			if(selection == 0)
			{
				flag = 0; //sets the flag to 0 so that the while loop stops
			}		
		}
	}
		
}

class PiggyBank
{
	private double balance;
	
	public PiggyBank(double total) //constructor method, assigns a balance to object piggbank
	{
		total = balance;
	}
	
	public double getBalance()	//accessor method for finding out the balance of the piggybank				
	{
		return(balance);
	}
	
	public void addPenny(double total) //mutator method for adding the amount of pennies to the object
	{
		balance = balance + (0.01*total);
	}
	
	public void addNickel(double total)//mutator method for adding the amount of nickels to the object
	{
		balance = balance + (0.05*total);
	}
	
	public void addDime(double total)//mutator method for adding the amount of dimes to the object
	{
		balance = balance + (0.10*total);
	}
	
	public void addQuarter(double total)//mutator method for adding the amount of quarters to the object
	{
		balance = balance + (0.25*total);
	}
	
	public void takeMoney(double total)////mutator method for taking money out of the object
	{
		balance = balance - total;
	}
	
	
}