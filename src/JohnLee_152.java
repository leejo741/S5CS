import java.util.* ;

public class JohnLee_152 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		
		double element = inp.nextInt();
		
		double number = 0;
		
		double sum = 0;
		
		while (element != 0);
		{
			element = inp.nextInt();
			
			if (element %2 == 0)
			{
				number ++;
				sum = sum + element;
			}
			else 
				number += 0;
				sum +=0;
			
		}
	
		System.out.println(sum/number);	
		
	}
}
