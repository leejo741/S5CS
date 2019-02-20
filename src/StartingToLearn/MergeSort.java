package StartingToLearn;

public class MergeSort 
{

	public static void main(String[] args) 
	{
		int [] A = {7, 2, 11, 9, 5, 8, 31, 22};
		
		System.out.println("Unsorted Array:");
		System.out.println(A);  //display method 
		System.out.println("Sorted Array:");
		System.out.println(mergeSort(A));  //display
	}

	public static int [] mergeSort (int [] A)
	{
		int n = A.length;
		if(n<2){
			return
		}
		int mid = n/2;
		
		int [] left = new int [mid];
		int [] right = new int [n-mid];
		
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
		

		
		return mergeSort(A);
	}
}
