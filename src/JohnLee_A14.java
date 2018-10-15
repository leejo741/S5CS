import java.util.*;

public class JohnLee_A14 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		
		
		double totalcount = 2;
		
		
		System.out.println("Enter the A value");
		double A = inp.nextDouble() ;
		System.out.println("Enter the B value");
		double B = inp.nextDouble() ;
		
		double C = A - B;
	
		System.out.print(A + ", " + B );
		
		
		while(A>B && C>0)
			{
				System.out.print(", " + C);
				A = B;
				B = C;
				C = A - B;
				totalcount ++;
				
				
			}
		System.out.println("\n" +  totalcount);
		
		}
		
	
}
