package practice;

import java.util.Arrays;

public class RunningArray {

	public static void main(String[] args) {
		int []nums= {1,2,3,4};
		int [] a= runningSum(nums);
		System.out.println("Running Sum is:"+ Arrays.toString(a) );
	}
	  public static int[] runningSum(int[] nums) {
		  int []total=new int[nums.length];
		  int sum=0;
		  for(int i=0;i<nums.length;i++) {
		  	sum+=nums[i];
		  	total[i]=sum;
		  } 	
		return total;
	        
	    }

}
