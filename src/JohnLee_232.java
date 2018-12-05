
public class JohnLee_232 
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
				matrix[row][col] = (int)(Math.random()*999) ;

			}
		}
		print(matrix);
		
		System.out.println() ;
		
		System.out.println("   " + minmax(matrix));
		
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
	
	static public int minmax (int [][] chart)
	{
		int min = max(chart[0]);
		int temp = 0;
		for(int row = 1; row < chart.length; row++)
		{
			temp = max(chart[row]);
			if(temp < min)
			{
				min = max(chart[row]);
			}
				
		}
		return min;
	}
	
	static public int max(int[] data)
	{
		int max = data[0];
		
		for(int i = 1; i < data.length; i++)
		{
			int temp = data[i];
			if(temp > max)
			{
				max = data[i];
			}
		}
		
		return max;
		
	}
}
