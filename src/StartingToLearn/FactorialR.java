package StartingToLearn;
import java.util.*;
public class FactorialR 
{
	public static void main (String[] args)
	{
		Scanner inp = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("Find factorial of:  ");
		num = inp.nextInt() ;
		
		System.out.println("Factorial: " + factorialCalc(num));
		

		
		
	}
	
	public static int factorialCalc(int n)
	{

		if (n == 1)
		{
			return 1;
		}
		return (n*(factorialCalc(n-1)));	
		
	}
	


	

}