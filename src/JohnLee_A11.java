import java.util.* ;

public class JohnLee_A11 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in); //activating the scanner
		
		double A = 0; // A is the first number inputed
		double B = 0; // B is the second number inputed
		double N = 0; // the number of times the for loop will take place
		double counter1 = 0; // this variable is used inside the for loops to count how many times the given statement is true 
		
		System.out.println("What is A");
		A = inp.nextDouble() ; // This allows the code to get the user input using the scanner
		System.out.println("\nWhat is B");
		B = inp.nextDouble() ; // This allows the code to get the user input using the scanner
		System.out.println("\nWhat is N");
		N = inp.nextDouble() ; // This allows the code to get the user input using the scanner
		System.out.println("Enter your sequence");
		
		double element = 0 ; //This is the variable with the number sequence that will be tested
		
		if (A<B) // This if statement determines what kind of arithmetic function we must use
		{
			for (int i=0; i<N; i++ ) // this loop makes sure the arithmetic function runs for N amount of numbers
			{
				element = inp.nextInt();
				
				if ( element %A == 0 && element %B != 0) // if the number is divisible by A it is a factor and if not divisible by b (has a remainder) than it is indivisible by B
				{
					counter1 ++; // if the above statement is true, this adds one to the counter
				}
			}
		}
		
		if (A > B || A == B) // This if statement also determines what kind of arithmetic function we must use
		{
			for (int i=0; i<N; i++ ) // This loop makes sure the arithmetic function runs for N amount of numbers
			{
			element = inp.nextInt();
					
				if ( element == A+B || element == A*B) // determines if the number is equal to A+B OR A*B
				{
					counter1 ++; // if it complies to the above statement, 1 is added to the counter
				}
			}
					
		}
		
		System.out.println(counter1); // prints out the final answer which is stored in this counter
	}
	
}
