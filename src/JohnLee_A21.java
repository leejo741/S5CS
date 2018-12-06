
public class JohnLee_A21 
{
	public static void main (String[] args)
	{
		int length = (int)(Math.random() *11 +2);
	
		double [][] chart = new double [length][length] ;
		for(int row = 0; row < length; row++)
		{
			int columns = length;
			chart[row] =new double[columns];
			for(int col = 0; col < length; col++)
			{
				chart[row][col] = (double)((Math.random() *90)-45);
			}
		}
		

		
		print(chart);
		
		weatherForecast(chart, length);
		
		print(chart);
	}
	static public void print( double [][] data)
	{
		System.out.println(); 
		for (int row = 0; row < data.length; row++)
		{
			for (int col = 0; col < data[row].length; col++)
			{
				System.out.printf("%6.1f",  data[row][col] ) ;
			}
			System.out.println();
		}
	}
	
	public static double[][] weatherForecast(double [][] map, int length)
	{
		
		int cols = 0;
		
		for(int i = 0; i < map.length; i++)
		{
			
			if(map[i][i] == map[0][0])
			{
				map[0][0] = ((map[1][0] + map[0][1])/2);
			}
			if(i=0 && map[i][cols] != map[0][0] && map[i][cols] != 0)
			{
				
			}
		}
		
		return map;
		
	}
}
