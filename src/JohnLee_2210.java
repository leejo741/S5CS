/*
 * This program tests the merge
 * 
 * a.length for the length of array a
 */
public class JohnLee_2210 
{
	public static int[] merge( int[] a, int[] b ) 	// the method returns the reference to the merged array
	{
		int [] c = new int[ a.length + b.length ] ; // the arrays a and b will be merged into the array c
		int ia = 0 ; 								// index of an element in the array a
		int ib = 0 ;                				// index of an element in the array b
		int ic = 0 ;
		
		while( ia < a.length && ib < b.length)
		{
			if (a[ia] < b[ib])
			{
				c[ic] = a[ia];
				ia ++ ;
				ic ++ ;	
			}
			else
			{
				c[ic] = b[ib] ;
				ib ++ ;
			}
			ic ++ ;
		}
		
													// Place the code of the merging algorithm here.
													// Merging can be done using three loops, one after another (not nested).
		return c ; 									// return the reference to the merged array
	}
}