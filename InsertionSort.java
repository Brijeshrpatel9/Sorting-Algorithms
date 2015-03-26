import java.util.Arrays;

public class InsertionSort
{
	//pre: array is full, all elements are non-null integers
	//post: the array is sorted in ascending order

	public static void insertionSort(int array[])
	{
		int temp;		// this variable is the element of the unsorted array currently
					// being compared to elements of the sorted array
		int pos;		// this variable keeps track of where in the sorted array the 
					// comparison takes place
	
		for (int i = 1; i < array.length; i++)		// loop through the unsorted array
		{
							// (the first element is considered sorted)
			temp = array[i];			// grab the first element of the unsorted array
			pos = i - 1;				// get the index of the last sorted element
		
			while ((pos >= 0) && (temp < array [pos]))	// while the current sorted element is greater than temp
			{
			array[pos + 1] = array[pos];		// keep shifting sorted elements back by 1
			pos--;					// decrement the pos index
		}
		array[pos + 1] = temp;				// insert temp such that array[pos] <= temp < array[pos + 2]
		System.out.print(Arrays.toString(array) + ", ");
		System.out.println("");
	}
}
	public static void main(String args[])
	{
		int[] data = {2, 45, 23, 56, 34, 886, 5, 99, 548, 10};
		insertionSort(data);
	}
}
 
