import java.util.Scanner;


public class JohnLee_174 
{
	public static double countFactors( double a)
	{
		int counter = 0;
		
		for (int i = 2; i <= (int)Math.sqrt(a); i++)
		{
			if (a %i == 0)
			{
				counter ++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		double a = inp.nextDouble();
		System.out.println("Factors :" + countFactors(a));
		
		System.out.println();
		
	
	}
}//UNFINISHED
