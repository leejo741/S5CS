
public class JohnLee_A22 
{
	public static void main (String[] args)
	{
		int length = (int)(Math.random() *11 +2);

		int [][] chart = new int [length][length] ;
		
		for(int row = 0; row < length; row++)
		{
			int columns = length;
			chart[row] =new int[columns];
			for(int col = 0; col < length; col++)
			{
				chart[row][col] = (int)((Math.random() *1.9));
			}
		}
		
	print(chart);
	
	System.out.println(); 
	System.out.println(testInfection(chart, length));
	
		
	}
	
	public static void print( int [][] data)
	{
		System.out.println(); 
		for (int row = 0; row < data.length; row++)
		{
			for (int col = 0; col < data[row].length; col++)
			{
				System.out.printf("%6d",  data[row][col] ) ;
			}
			System.out.println();
		}
	}
	
	public static int testInfection(int map [][], int length)
	{
		boolean infection = false;
		int check = 0;
		int days = 0;
		int infPeople = 0;
		
		int temp [][] = new int [length][length];
			for(int a = 0; a < map.length; a++)
			{
				for(int b = 0; b < map.length; b++)
				{
					if(temp[a][b] == 1)
					{
						infPeople ++;
					}
					temp[a][b] = map[a][b];
				}
			}
			
		while(infection == false)
		{
		
			infPeople = 0;
			for(int i = 0; i < temp.length; i++)
			{
				check = 0;
				for(int k = 0; k < temp.length; k++)
				{
					if(temp[i][k] == 0)
					{
						if(k-1 >= 0 && temp[i][k-1] != 0)
						{
							check ++;
						}
						if(k+1 < temp.length && temp[i][k+1] !=0) 
						{
							check ++;
						}
						if(i-1 >= 0 && temp[i-1][k] != 0)
						{
							check ++;
						}
						if(i+1 < temp.length && temp[i+1][k] != 0)
						{
							check ++;
						}
						
						if( check >= 2)
						{
							infPeople ++;
							temp[i][k] = 1;
						}
						
					}
					
				}
			
			}
			
			if (infPeople == 0)
			{
				infection = true;
			}
			else
			{
				days ++;
			}
		}
		for(int m = 0; m < temp.length; m++)
		{
			for(int n = 0; n < temp.length; n++)
			{
				if(temp[m][n] == 0)
				{
					return -1;
				}
			}			
		}			
		return days;		
	}
}
