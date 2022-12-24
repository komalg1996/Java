package from17;

import java.util.Arrays;

public class SelectionSort22 {

	public static void main(String[] args) {
		int[] arr = { 33, 22, 66, 11, 99, 12 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

//		selection(arr);
//		System.out.println(Arrays.toString(arr));
	}

	// select max within array and put at end
	public static void selectionSort(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			int last=arr.length-i-1;
			int max=0;
			for(int j=0;j<=last;j++) {
				if(arr[max]<arr[j]) {
					max=j;
				}
			}
			int temp=arr[last];
			arr[last]=arr[max];
			arr[max]=temp;
			
		}
	}
//	public static int maxIndex(int[] arr, int start, int end) {
//		int max=start;
//		for(int i=start;i<=end;i++) {
//			if(arr[max]<arr[i]) {
//				max=i;
//			}
//		}
//		return max;
//	}

	// select min within array and put at 1st position
	public static void selection(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			// single pass
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

}
