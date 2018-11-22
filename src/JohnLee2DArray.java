//intro to 2d arrays
//int [][] = new int[6][10]; This sets up a two dimensional array with [row][column]

public class JohnLee2DArray 
{
	
	public static void main (String[] args)
	{
		int rows = (int)(Math.random()*6+1); //+1 caus cant have zero rows, this gives max 6 rows
		
		int [][] matrix = new int[rows][];
		
		for (int row = 0; row < matrix.length; row++)
		{
			int cols = (int)(Math.random()*6+1);
			matrix[row] = new int [cols];
			for (int col = 0; col < matrix[row].length; col++)
			{
				matrix[row][col] = (int)(Math.random()*999) ;

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
