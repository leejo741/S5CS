package StartingToLearn;

public class MergeSort 
{

	public static void main(String[] args) 
	{
		int [] A = {7, 2, 11, 9, 5, 8, 31, 22};
		
		System.out.println("Unsorted Array:");
		display(A);
		System.out.println("Sorted Array:");
		display(mergeSort(A));
	}

	public static int [] mergeSort (int [] A)
	{
		int n = A.length;
		
		if(n<2)
		{
			return A;
		}
		
		int mid = n/2;
		
		int [] left = new int [mid];
		int [] right = new int [n-mid];
		
		int z = right.length;
		
		for( int i = 0; i < mid; i++)
		{
			left[i] = A[i];
		}
		
		for( int j = mid; j < n; j++)
		{
			right[j-mid] = A[j];
		}
		
		mergeSort(left);
		mergeSort(right);

		merge (left, mid , right, z, A);
		
		
		return A;
	}
	
	public static void merge(int[] left, int l, int[] right, int r, int[] A)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<l && j <r)
		{
			if (left[i] <= right[j])
			{
				A[k] = left[i];
				i++;
				k++;
			}
			else
			{
				A[k] = right[j];
				j++;
				k++;
			}
		}
		
		while(i < l)
		{
			A[k] = left[i];
			i++;
			k++;
		}
		
		while(j<r)
		{
			A[k] = right[j];
			j++;
			k++;
		}
	}

	public static void display(int[] array)
	{
		for (int i = 0; i<array.length; i++)
		{
			System.out.print(array[i]+ " ");
		}
		System.out.println();
	}
}
