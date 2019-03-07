
public class johnAPpractice 
{
	public static void main (String[] args)
	{
		Height sample = new Height(5,16);
		Height sampleInch = new Height(77);
		
		System.out.println( sample.getFeet() + "'" + sample.getInches() + "\"");
		System.out.println( sampleInch.getFeet() + "'" + sampleInch.getInches() + "\"");
	}

	
}

class Height
{
	private int feet = 0;
	private int inches  = 0;
	
	
	public Height (int feet2, int inches2)
	{
		feet = feet2;
		inches = inches2;
		
		if(inches >11)
		{
			simplify();
		}	
	}
	
	public Height (int inches2)
	{
		inches = inches2;
		
		if(inches >11)
		{
			simplify();
		}
		
	}
	
	public void simplify()
	{
		if (inches >=12)
		{
			int crit = inches /12;
			int mod = inches %12;
			
			inches = mod;
			feet = feet +crit;
		}
	}
	
	public int getFeet()
	{
		return feet;
	}
	
	public int getInches()
	{
		return inches;
	}
	
	public int setFeet(int newFeet)
	{
		feet = newFeet;
		return feet;
	}
	
}