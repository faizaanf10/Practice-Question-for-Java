import java.util.*;
class RQuickSort
{

	public static void main(String[] args)
	{
			int[] arr = { 10, 7, 8, 9, 1, 5, 1};
			quickSort(arr, 0, arr.length - 1);

			System.out.println("Sorted array : ");
			System.out.print(Arrays.toString(arr));
	}

	static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int low, int high){
		int rIndex = (low) + (int)(Math.random() * (high - low + 1));

		//swap low with random

		swap(arr, low, rIndex);

		int pivot = arr[low];
		int i = low - 1;
		int j = high + 1;

		while(true){

			do{
				i++;
			}while(arr[i]< pivot);

			do{
				j--;
			}while(arr[j] > pivot);

			if(i>=j){
				return j;
			}
			swap(arr, i, j);
		}
	}

	static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            // find partition index

            int p = partition(arr, low, high);
            // sort before and after the pivot

            quickSort(arr, low, p);
            quickSort(arr, p + 1, high);
        }
    }
}


