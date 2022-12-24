package from17;

import java.util.Arrays;
import java.util.Scanner;

public class BinartSearch27 {

	public static void main(String[] args) {
		int []arr= {10,20,30,40,50,60};
		System.out.println(Arrays.toString(arr));
		//int key=30;
		//System.out.println("enter key");
		//Scanner sc=new Scanner(System.in);
		//System.out.println(binarySearch(arr, sc.nextInt()));
		System.out.println(binarySearch(arr, 50, 0, 5));
		System.out.println(binarySearch(arr, 20, 0, 5));
		
	}
	
	//binary search without recursion
	public static int  binarySearch(int[] arr, int key) {
		System.out.println(Arrays.toString(arr));
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(key<arr[mid]) {
				high=mid-1;
			}else
				low=mid+1;
		}
		return -1;
	}
	
	//binary search with recursion
	public static int binarySearch(int[] arr, int key, int low, int high) {
		
		if(low>high) {
		return -1;
		}
		int mid=(low+high)/2;
		if(arr[mid]==key) {
			return mid;
		}
		if(key<arr[mid]) {
			return binarySearch(arr, key, low, mid-1);
		}else {
			return binarySearch(arr, key, mid+1, high);
		}
	}

}
