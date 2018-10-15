import java.util.*;
public class JohnLee_A12 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in); // initializes the scanner
		
		System.out.println("How many sides does the first dice have?");
		int n = inp.nextInt(); // number of sides on the first dice
		System.out.println("How many sides does the second dice have?");
		int m = inp.nextInt(); // number of sides on the second dice
		System.out.println("What is the desired sum?");
		int s = inp.nextInt(); // the integer that the two sides of the dice must be equal to
		
		int ans = 0; // this is the counter that will count the number of possibilities there are to get the sum to s
		
		for(int i=1; i<=n; i++)  //runs the loop as many times as the number of sides on the first dice, stores each number in counter i
		{
			for(int j=1; j<=m; j++)  //runs the loop as many times as the number of sides on the second dice, stores each number in counter j
			{
				if(i+j==s)  //determines if the number on the die add up to s
				{
					ans++; //if the die add up to s, one gets added to the counter
				}
			}
		}
		System.out.println("\nThere are " + ans + " ways to get a sum of " + s ); // this statement prints out the answer
	}
}