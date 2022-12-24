package from17;

import java.util.Arrays;

public class linearSearch26 {

	public static void main(String[] args) {
		int[] arr = { 20, 30, 40, 50, 60, 70 };
		System.out.println(Arrays.toString(arr));
		int key = 50;
		System.out.println("key at: " + linearSearch(arr, key));
	}

	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;

	}
}