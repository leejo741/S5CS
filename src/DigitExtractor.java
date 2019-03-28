import java.util.Scanner;

public class DigitExtractor 
{
	public static void main (String[] args)
	{
		String selection;
		
		String reset = "nothing";
		
		Scanner inp = new Scanner(System.in);
		
		int value = 0;
		
		System.out.println("Enter your number: ");
		value = inp.nextInt();
		
		num input = new num(value);
		
		int flag = 1;
		
		while (flag == 1)
		{
			System.out.println("\nEnter your choice: ");
			
			selection = inp.next();
			
			
			if(selection.equals("W") || selection.equals("w"))
			{
				System.out.println("The whole number is: " + input.getNum());
				
				selection = reset;
				
			}
			
			if(selection.equals("O") || selection.equals("o"))
			{
				System.out.println("The ones place number is: " + input.getOnes());

				
				selection = reset;
				
			}
			
			if(selection.equals("T") || selection.equals("t"))
			{
				
				System.out.println("The tens place number is: " + input.getTens());

				
				selection = reset;
				
			}
			
			if(selection.equals("H") || selection.equals("h"))
			{
				System.out.println("The hudreds place number is: " + input.getHundreds());

				selection = reset;
			}
			
			
			if(selection.equals("Q") || selection.equals("q"))
			{
				flag = 0;
			}
		}
	}
}

class num
{
	private int number;
	
	public num(int value)
	{
		number = value;
	}
	
	public int getNum()
	{
		return(number);
	}
	
	public int getOnes()
	{
		return(number %10);
	}
	
	public int getTens()
	{
		return(number /10 %10);
	}
	
	public int getHundreds()
	{
		return(number /100 %10);
	}
}