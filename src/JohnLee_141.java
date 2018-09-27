import java.util.* ;

public class JohnLee_141
{
	public static void main(String[] args)
	{

		Scanner inp = new Scanner(System.in) ;

		double x = 0;
		double y = 0;
		double r = 0;

		System.out.println("What is the x coordinate");
		x = inp.nextDouble() ;
		System.out.println("\nWhat is the y coordinate");
		y = inp.nextDouble() ;
		System.out.println("\nWhat is the radius of the circle?");
		r = inp.nextDouble() ;

		if (r <= 0)
		{
			System.out.println("\nInvalid radius") ;
		}
		else
		{
			if( (x*x)+(y*y) <= (r*r))
			{
				System.out.println("\nWithin") ;
			}

			else
			{
				System.out.println("\nBeyond") ;
			}
		}

	}

}
