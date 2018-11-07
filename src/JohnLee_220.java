/*
 * This program tests the insertion sort
 */
public class JohnLee_220 
{
	public static void main(String[] args)
	{
		// create an array
		int[] data = new int[100] ;
		
		// fill the array with random numbers
		for( int i = 0 ; i< data.length ; i++)
		{
			data[i] = (int)(Math.random()*1000); //the range of the numbers is 0-1000
		}
		// print the array
		print( data, 7) ;
		// sort the array using insertion sort
		insertionSort( data) ;
		// print the sorted array
		print( data, 7) ;
	}
	//this method sorts an array using the insertion algorithm
	public static void insertionSort(int[] data)
	{
		if(data == null || data.length <2) return;
		{
			int first = 1; // the index of the first element in the unsorted part
			while ( first < data.length)
			{
				// insert the first element from the unsorted part into its correct position in the sorted part
				for ( int i = first ; i>0 && data[i] <= data[i-1] ; i--)
				{
					swap(data, i, i-1) ;
				}
				
				// increase the sorted part / decrease the unsorted part
				first ++;
				
			}
		}
	}
	
	static public void swap ( int [ ] b,int n, int m )
	{
		int tmp = b[ n ] ;
		b [ n ] = b[ m ] ;
		b[ m ] = tmp ;	
	}
	
	static public void print( int [ ] data , int cols )
	{
		if ( cols < 1)
		cols = 1 ;
		System.out.print("\n\n") ; // separate from previous output
		int rows = data.length / cols ; // the number of full rows
		for ( int i = 0 ; i < rows ; i ++ ) // print each full row
		{
			for( int j= 0 ; j < cols ; j ++ )
			{
				System.out.printf( "  %6d" , data[ i * cols + j ] ) ; // formatted output
			}
			System.out.println() ; // move the cursor to a new line
		}
		for ( int i = rows * cols ; i < data.length ; i ++ ) // print last row ( might be not full)
			System.out.printf( "  %6d", data[ i ] ) ; // formatted output
		System.out.print("\n\n") ; // separate from next output
	}
}
