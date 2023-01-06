//https://practice.geeksforgeeks.org/problems/sum-of-array-elements2502/1?page=2&difficulty[]=0&category[]=Arrays&sortBy=submissions
package gfg;

public class arraySum {

	public static void main(String[] args) {
		int arr[]= {3,2,1};
		System.out.println(sumElement(arr, 3));
	}
	public static int sumElement(int arr[],int n)
	{ 
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			
		}
		return sum;
	    
	}

}
