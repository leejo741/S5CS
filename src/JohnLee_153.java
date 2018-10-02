import java.util.* ;

public class JohnLee_153 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		
		double element = inp.nextInt();
		double number = 0;
		double sum = 0;
		
		while (element != 0)
		{
			element = inp.nextInt() ;
			
			if (number > element)
			{
				number = element;
				sum ++;
			}
			
		}
		System.out.println(sum);
	}
} //INCOMPLETE
