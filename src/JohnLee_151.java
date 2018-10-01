import java.util.* ;

public class JohnLee_151 

{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in) ;
		
		double element = inp.nextInt(); //input
		double number = 0; //total number of negative numbers
		
		while (element != 0)
		{
			element = inp.nextInt(); //input
			
			if (element < 0)
			{
				number ++; // number += 1 works as well, number after = is the amount being added on	
			}
			else
				number += 0;
		
		}
		
		System.out.println(number);
			
		
	}
}
