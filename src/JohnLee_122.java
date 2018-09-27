public class JohnLee_122
{
	public static void main(String[] args)
	{

		double x = 5 ;
		double y = x ;
		y = y*y ; //x^2
		y = y*y ; //x^4
		y = y*y ; //x^8
		double z = y ;
		y = y*y ; //x^16
		y = y*y ; //x^32
		y = y*y*y ; //x^96
		y = x*y*z ; 
	
		System.out.println(y);


	}
}