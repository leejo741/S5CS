import java.util.Scanner;
// 4*6 = 12, != 24

public class JohnLee_173 
{
	public static double lcm( double a, double b)
	{
		double product = a*b;
		double ans = product/gcf(a, b) ;
		return ans;
	}
	
	public static double gcf ( double a, double b ) 
	{
		double min = Math.min( a, b ) ; 
		double max = Math.max( a,b ) ; 
		double rem = max % min ; 
		while ( rem != 0 )
		{ 
			max = min ;
			min = rem ;
			rem = max % min ;
		}
	return min ;
	} 
	 
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		
		double a = inp.nextDouble();
		double b = inp.nextDouble();
		
		System.out.println("LCM: " + lcm(a, b));
	
	}
}
