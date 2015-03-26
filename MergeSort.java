import java.util.Arrays;

public class MergeSort {

	public static void merge_sort(int[] a)
	{
		int[] tempArray = new int[a.length];
		merge_sort(a, tempArray, 0, a.length - 1);
	}
	
	public static void merge_sort(int[] a, int[] tempArray, int left, int right)
	{
		if(left < right)
		{
			int center = (left + right)/2;
			merge_sort(a, tempArray, left, center);
			merge_sort(a, tempArray, center+1, right);
			System.out.print(Arrays.toString(a));
			System.out.println("");
			merge(a, tempArray, left, center+1, right);
		}
	}
	
	public static void merge(int[] a, int[] tempArray, int leftPos, int rightPos, int rightEnd)
	{
		int leftEnd = rightPos-1;
		int tmpPos = leftPos;
		int numElements = rightEnd - leftPos + 1;
		while(leftPos <= leftEnd && rightPos <= rightEnd)
		{
			if(a[leftPos] <= a[rightPos])
				tempArray[tmpPos++] = a[leftPos++];
			else
				tempArray[tmpPos++] = a[rightPos++];
		}
		while(leftPos <= leftEnd)
			tempArray[tmpPos++] = a[leftPos++];
		while(rightPos <= rightEnd)
			tempArray[tmpPos++] = a[rightPos++];
		for(int i = 0; i < numElements; i++, rightEnd--)
			a[rightEnd] = tempArray[rightEnd];
			
		
	}
	
	public static void main(String argv[])
	{
		int[] data = {45,23,11,89,77,98,4,28,65,43};
		merge_sort(data);
		System.out.println("Sorterd Array by Merge Sort: ");
		for(int i:data){
	        	System.out.print(i);
	        System.out.print(" ");
		}
	}
}




/*
public class MyMergeSort {
     
    private int[] array;
    private int[] tempMergArr;
    private int length;
 
    public static void main(String a[]){
         
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        MyMergeSort mms = new MyMergeSort();
        mms.sort(inputArr);
        System.out.println("Sorterd Array by Merge Sort: ");
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            
            System.out.print(Arrays.toString(array));
            System.out.println("");
            mergeParts(lowerIndex, middle, higherIndex);
            
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
} */
