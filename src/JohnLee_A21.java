
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
				chart[row][col] = (double)((Math.random() *80)-40);
			}
		}
		
		print(chart);
		
		print(weatherForecast(chart, length));
		
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
		double temp [][] = new double[length][length];
				
		for(int i = 0; i < map.length; i++)
		{
			for(int k = 0; k < map[i].length; k++)
			{
				
				if (map[i][k] == map[0][k]||map[i][k] == map[map.length - 1][k] ||map[i][k] == map[i][0] ||map[i][k] == map[i][map.length - 1])
				{
					
					if(map[i][k] == map[0][k])
					{
						if(map[i][k] == map[0][0] || map[i][k] == map[0][map.length - 1])
						{
							temp[0][0] = ((map[1][0] + map[0][1])/2);
							temp[0][map.length - 1] = ((map[0][map.length - 2] + map[1][map.length - 1])/2);
						}
						else
						{
							temp[0][k] = ((map[0][k-1]+map[0][k+1])/2) ;
						}
					}
				
					if(map[i][k] == map[map.length - 1][k])
					{
							if(map[i][k] == map[map.length - 1][0] || map[i][k] == map[map.length - 1][map.length - 1])
							{
								temp[map.length - 1][0] = ((map[map.length - 2][0] + map[map.length - 1][1])/2);
								temp[map.length - 1][map.length - 1] = ((map[map.length - 1][map.length - 2] + map[map.length - 2][map.length - 1])/2);
							}
							else
							{
								temp[map.length - 1][k] = ((map[map.length - 1][k-1]+map[map.length - 1][k+1])/2) ;
							}
					}
					
					if(map[i][k] == map[i][0])
					{
						if(map[i][k] == map[0][0] || map[i][k] == map[map.length - 1][0])
						{
							temp[0][0] = ((map[1][0] + map[0][1])/2);
							temp[map.length - 1][0] = ((map[map.length - 2][0] + map[map.length - 1][1])/2);
						}
						else
						{
							temp[i][k] = ((map[i-1][0]+map[i+1][0])/2) ;
						}
					}
				
					if(map[i][k] == map[i][map.length - 1])
					{
						if(map[i][k] == map[0][map.length - 1] || map[i][k] == map[map.length - 1][map.length - 1])
						{
							temp[0][map.length - 1] = ((map[0][map.length - 2] + map[1][map.length - 1])/2);
							temp[map.length - 1][map.length - 1] = ((map[map.length - 1][map.length - 2] + map[map.length - 2][map.length - 1])/2);
						}
						else
						{
							temp[i][map.length - 1] = ((map[i-1][map.length - 1]+map[i+1][map.length - 1])/2) ;
						}
					}
				}
				else
				{
					temp[i][k] = (map[i][k-1] + map[i][k+1] + map[i-1][k] + map[i+1][k])/4 ;
				}
				
			}
		
		}
		
		return temp;
		
	}
}
