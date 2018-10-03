import java.util.* ;

public class JohnLee_A11 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		
		double A = 0; 
		double B = 0;
		double N = 0; // the number of times the for loop will take place
		double counter1 = 0;
		
		System.out.println("What is A");
		A = inp.nextDouble() ;
		System.out.println("\nWhat is B");
		B = inp.nextDouble() ;
		System.out.println("\nWhat is N");
		N = inp.nextDouble() ;
		System.out.println("Enter your sequence");
		double element = 0 ; //Only make input once
		
		if (A<B)
		{
			for (int i=0; i<N; i++ )
			{
				element = inp.nextInt();
				
				if ( element %A == 0 && element %B != 0)
				{
					counter1 ++;
				}
			}
		System.out.println(counter1);
		if (A > B || A == B)
			{
				for (int i=0; i<N; i++ )
				{
					element = inp.nextInt();
					
					if ( element == A+B || element == A*B)
					{
						counter1 ++;
					}
				}
			}
		System.out.println(counter1);	
		}		
		
		
	}
} //UNFINISHED!
