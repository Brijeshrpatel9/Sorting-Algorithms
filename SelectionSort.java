import java.util.Arrays;

public class SelectionSort
{
	public static void selectionSort(int[] data)
	{
		int i, j, temp, minIndex;
		int n = data.length;
		for(i = 0; i < n -1 ; i++)
		{
			minIndex = i;
			for(j = i+1; j < n; j++)
			{
				if(data[j] < data[minIndex])
				{
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
			System.out.print(Arrays.toString(data) + ", ");
			System.out.println("");
		}
	}
	public static void main(String argv[])
	{
		int[] data = {2, 45, 23, 56, 34, 886, 5, 99, 548, 10};
		selectionSort(data);
	}
}
