import java.util.Scanner;


public class JohnLee_172 
{
	public static  double getArea( double a, double b, double c)
	{
	
		if (a + b > c && b + c > a && c + a > b)
		{
			double s = (a + b + c)/ 2 ;
			double area = (double)Math.sqrt(s*(s-a)*(s-b)*(s-c));
			
			return area;
		}
		return -1;
	
	}
	
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		double a = inp.nextDouble();
		double b = inp.nextDouble();
		double c = inp.nextDouble();
		
		System.out.println("Area: " + getArea(a, b, c));
		
	
	}
}
