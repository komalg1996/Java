package practice;
import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/concatenation-of-array/
public class ConcatArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size: ");
		// int size=sc.nextInt();
		// int [] arr1=new int[size];
		int[] nums = new int[sc.nextInt()];
		System.out.println("Enter Array Elements: ");
		// read array elements from user
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		// ConcatArray a=new ConcatArray();
		// int []ans=a.getConcatenation(nums);
		int[] ans = getConcatenation(nums);
		System.out.println("New Array : " + Arrays.toString(ans));

	}

	public static int[] getConcatenation(int[] nums) {
		int[] ans = new int[(2 * nums.length)];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[i + nums.length] = nums[i];
		}
		return ans;
	}

}
