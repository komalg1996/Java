package from17;

import java.util.Arrays;

public class BubbleSort21 {

	public static void main(String[] args) {
		int[] arr = { 55, 44, 11, 77, 33 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

}
