package from17;

import java.util.Arrays;

public class QuickSort24 {

	public static void main(String[] args) {
		int[] arr = { 8, 4, 5, 2, 9 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int lo, int hi) {
		if (lo >= hi)
			return;
		int start = lo;
		int end = hi;
		int mid = start + (end - start) / 2;
		int pivot = arr[mid];
		// to set pivot at its place
		while (start <= end) {
			while (arr[start] < pivot) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}
			if (start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		//left
		quickSort(arr, lo, end);
		//right
		quickSort(arr, start, hi);
	}

}
