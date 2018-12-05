import java.util.*;


public class JohnLee_171 
{
	public static boolean isPrime (int n)
	{
		for(int i = 2; i <= (int)Math.sqrt(n); i++)
		{
			if (n%i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		System.out.println("prime: " + isPrime(n));
	}
}
