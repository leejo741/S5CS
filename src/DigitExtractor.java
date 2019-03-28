import java.util.Scanner;

public class DigitExtractor 
{
	public static void main (String[] args)
	{
		String selection;
		
		String reset = "nothing"; //initialize the variable to switch "selection" to so that user can continue to make choices
		
		Scanner inp = new Scanner(System.in);
		
		int value = 0;
		
		System.out.println("Enter your number: ");
		value = inp.nextInt();	//allows user to pick a number to use
		
		num input = new num(value); //sets up a new object and uses the constructor method with the "value"
		
		int flag = 1;// will be used in the while loop to end the loop when the user decides to
		
		while (flag == 1)
		{
			System.out.println("\nEnter your choice: ");
			
			selection = inp.next();
			
			
			if(selection.equals("W") || selection.equals("w")) //allows for input of both lowercase and capital letters
			{
				System.out.println("The whole number is: " + input.getNum()); //calls the accessor for getting the whole number
				
				selection = reset; //changes "selection" to "reset" so that user can choose another option
				
			}
			
			if(selection.equals("O") || selection.equals("o"))//allows for input of both lowercase and capital letters
			{
				System.out.println("The ones place number is: " + input.getOnes());//calls the accessor for getting the ones digit place holder

				
				selection = reset;
				
			}
			
			if(selection.equals("T") || selection.equals("t"))//allows for input of both lowercase and capital letters
			{
				
				System.out.println("The tens place number is: " + input.getTens());//calls the accessor for getting the tens digit place holder

				
				selection = reset;
				
			}
			
			if(selection.equals("H") || selection.equals("h"))//allows for input of both lowercase and capital letters
			{
				System.out.println("The hudreds place number is: " + input.getHundreds());//calls the accessor for getting the hundreds digit place holder

				selection = reset;
			}
			
			
			if(selection.equals("Q") || selection.equals("q"))//allows for input of both lowercase and capital letters
			{
				flag = 0; //changes the flag to zero so the while loop ends
			}
		}
	}
}

class num
{
	private int number; //private double for holding the number value
	
	public num(int value) //constructor method that assigns the number value to the double
	{
		number = value;
	}
	
	public int getNum()//accessor method for getting the value of the number
	{
		return(number);
	}
	
	public int getOnes()//accessor method for getting the ones place holder
	{
		return(number %10); 
	}
	
	public int getTens()//accessor method for getting the tens place holder
	{
		return(number /10 %10);
	}
	
	public int getHundreds()//accessor method for getting the hundreds place holder
	{
		return(number /100 %10);
	}
}