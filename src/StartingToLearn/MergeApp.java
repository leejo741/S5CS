package StartingToLearn;

class MergeApp{

	public static void main(String[] args){
		int[] left={22, 47, 81, 95};
		int[] right={7, 14, 39, 55, 62, 74};
		int[] array= new int[10];

		merge (left, 4, right, 6, array);
		display (array);
	}
public static void merge(int l[], int left, int r[], int right, int[] a){
		int i=0, j=0, k=0;  //initialize three index variable

		//while both arrays are non-empty
		while (i<left && j<right){
			if (l[i]<=r[j]){
				a[k]=l[i];
				k++;
				i++;
			}
			else {
				a[k]=r[j];
				k++;
				j++;
			}
		}
		//while array right is empty, but left is not
		while (i<left){
			a[k]=l[i];
			k++;
			i++;
		}
		//while array left is empty, but right is now
		while (j<right){
			a[k]=r[j];
			k++;
			j++;
		}

	}
	public static void display(int[] array){
			for (int i = 0; i<array.length; i++){
					System.out.print(array[i]+ " ");
					}
			System.out.println();
	}
}