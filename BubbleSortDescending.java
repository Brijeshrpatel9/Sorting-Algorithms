import java.util.Arrays;
//Descending order
public class BubbleSortDescending
{
	public static void bubble_sort(int[] data)
	{
		int temp = 0;
		int n = data.length;
		for(int i = 0; i < (n-1); i++)
		{
			for(int j = 1; j < (n-i); j++)
			{
				if(data[j-1] < data[j])
				{
					temp = data[j-1];
					data[j-1] = data[j];
					data[j] = temp;
				}
			}
			System.out.print(Arrays.toString(data)+ ", ");
			System.out.println("");
		}	
	}

	public static void main(String argv[])
	{
		int[] data = {2,45, 23, 56, 34, 886, 5,99, 548, 10};
		bubble_sort(data);
	}
}
