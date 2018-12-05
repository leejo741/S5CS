
public class JohnLee_231 
{
	public static void main (String[] args)
	{
		int rows = (int)(Math.random()*6+1); //+1 cause cant have zero rows, this gives max 6 rows

		int [][] matrix = new int[rows][];
		
		for (int row = 0; row < matrix.length; row++)
		{
			int cols = (int)(Math.random()*6+1);
			matrix[row] = new int [cols];
			
			for (int col = 0; col < matrix[row].length; col++)
			{
				matrix[row][col] = (int)(Math.random()*99) ;

			}
		}
		print(matrix);
	
		
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
}
