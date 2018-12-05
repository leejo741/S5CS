
public class JohnLee_233 
{
	public static void main (String[] args)
	{
		int length = (int)(Math.random() *11);
	
		int [][] chart = new int [length][length] ;
		for(int row = 0; row < length; row++)
		{
			int columns = length;
			chart[row] =new int[columns];
			for(int col = 0; col < length; col++)
			{
				chart[row][col] = 0;
			}
		}
		
		crosses(chart, length);
		
		print(chart);
		
	}
	static public void print( int [][] data)
	{
		System.out.println(); 
		for (int row = 0; row < data.length; row++)
		{
			for (int col = 0; col < data[row].length; col++)
			{
				System.out.printf("%6d",  data[row][col]) ;
			}
			System.out.println();
		}
	}
	
	static public void crosses(int [][] table, int length)
	{
		int c = 0;
		
		for(int row = 0; row < length/2 + 1; row++)
		{
			table[row][c] = 1;
			table[row][table.length - 1 - c] = 1;
			table[table.length - 1 - c][c] = 1;
			table[table.length - 1 - c][table.length - 1 - c] = 1;
			c++;
			
		}
				
	}
}
