package from17;

import java.util.Arrays;

public class Merge25 {

	public static void main(String[] args) {
		int []arr= {4,7,3,2,9};
		System.out.println(Arrays.toString(mergesort(arr)));
	}
	public static int[] mergesort(int[] arr) {
		if(arr.length==1) {
		return arr;
		}
		int mid=arr.length/2;
		int []left=mergesort(Arrays.copyOfRange(arr, 0, mid));
		int []right=mergesort(Arrays.copyOfRange(arr, mid, arr.length));
		return merge(left,right);
		
	}
	public static int[] merge(int[] first, int[] second) {
		int []mix=new int[first.length+second.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<first.length && j<second.length) {
			if(first[i]<second[j]) {
				mix[k]=first[i];
				i++;
			}else {
				mix[k]=second[j];
				j++;
			}
			k++;
		}
		while(i<first.length) {
			mix[k]=first[i];
			i++;
			j++;
		}
		while(j<second.length) {
			mix[k]=second[j];
			j++;
			k++;
		}
		
		return mix;
	}
	

}
