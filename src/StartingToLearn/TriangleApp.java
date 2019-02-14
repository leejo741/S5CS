package StartingToLearn;

import java.util.*;
public class TriangleApp 
{
	public static void main (String[] args)
	{
		Scanner inp = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("Enter a number: ");
		num = inp.nextInt() ;
		
		System.out.println("Triangle Number(Using loops): " + triangleL(num));
		
		System.out.println("Triangle Number: " + triangle(num));
		
		
	}
	
	public static int triangleL(int n)
	{
		int total = 0;
		
		for (int counter = 1 ; counter <= n; counter++ )
		{
			total = total + counter;
		}
		
		return total;
		
	}
	
	public static int triangle(int n)
	{
		if (n==1)
		{
			return 1;
		}
		
		return (n + triangle(n-1));
		
	}


	

}
