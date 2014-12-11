// Quick Sort Algorithm

import java.util.Arrays;

public class QuickSort{
	
	public static int partition(int[] data, int left, int right)
	{
		int i = left;
		int j = right;
		int pivot = data[(left+right)/2];
		
		while(i <= j)
		{
			while(data[i] < pivot)
				i++;
			while(data[j] > pivot)
				j--;
			if(i <= j)
			{
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				i++;
				j--;
			}	
		}
		return i;
	}
	public static void quick_sort(int[] data, int left, int right)
	{
		int index = partition(data, left, right);
		if(left < index -1)
			quick_sort(data, left, index-1);
		if(index < right)
			quick_sort(data, index, right);
		System.out.print(Arrays.toString(data));
		System.out.println("");
	}
	
	public static void main(String argv[])
	{
		int data[] = {2, 45, 23, 56, 34, 886, 5, 99, 548, 10};
		int n = data.length;
		quick_sort(data, 0, n-1);
	}
}

