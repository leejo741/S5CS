import java.util.*;

public class JohnLee_A13 
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in); //initializing the scanner
		
		double D = 0; // The variable that determines the number of digits the number has
		double Z = 0;// The variable that determines the number of zeros we want in our number
		double low = 1; // The variable for finding the lowest number in our range
		double high = 1; // The variable that determines the highest number in our range
		double mod = 1; // The variable that finds out if the number has Z number of zeros
		int counter = 0; // This counter stores our answer
		
		System.out.println("What is the desired number of digits?");
		D = inp.nextDouble() ;
		System.out.println("\nWhat is the desired number of zeros?");
		Z = inp.nextDouble() ;	
		
		for (double digits = 1; digits < D; digits++) // this whole for loop determines the lowest number by multiplying 10 D-1 number of times
		{
			low = 10 * low;// low becomes the lowest number
		}
	
		for (double bigdigits = 1; bigdigits <= D; bigdigits ++) // this whole for loop determines the highest number by multiplying 10 D number of times
		{
			high = 10 * high;//high becomes the highest number
		}
		
		for (double divisor = 1; divisor <= Z; divisor ++) // this loop is for finding the divisor that will be used later
		{
			mod = 10 * mod;
		}
		
		for (double i = low ; i < high; i++) // this loop runs from the lowest number to the highest one
		{
			if (i * (i - 1) %mod == 0 && i*(i-1)%(mod*10) != 0) //this makes sure that the number times itself minus 1 is zero and that it end with Z number of zeros
			{
				counter ++; // adds one to the counter if all criteria are met
			}
			
		}
		
		System.out.println("\nThere are " + counter + " numbers that match your criteria in the given range."); //prints out the answer that is stored in the counter
		
	}
}
