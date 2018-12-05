
public class JohnLee_234 
{
	public static void main (String[] args)
	{
//		int length = (int)(Math.random() *11);
		int length = 12;
	
		int [][] table = new int [length][length] ;
		for(int row = 0; row < length; row++)
		{
			int columns = length;
			table[row] =new int[columns];
			for(int col = 0; col < length; col++)
			{
				table[row][col] = 1;
			}
		}
		
		triangles(table, length);
		print(table);
		
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
	
	static public void triangles(int [][] table, int length)
	{
		int c = 0;
		int d = 0;
		
		for(int row = 1; row < length/2 + 1; row++)
		{
			table[row][c] = 0;
			table[row][table.length - 1 - c] = 0;
			
			if(row > 1)
			{
				table[row][0] = 0;
				table[row][table.length - 1] = 0;
				table[row][d] = 0;
				table[row][table.length - 1 - d] = 0;
			
				d++;
			}
			table[table.length  - 1 - c][c] = 1;
			table[table.length - 1 - c][table.length - 1 - c] = 1;
			c++;
			
		}
				
	}
}
