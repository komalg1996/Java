package arrays;

import java.util.Arrays;

public class Test2DArray {

	public static void main(String[] args) {
		double[][] data = new double[3][4];
		int value = 1;
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[i].length; j++)
				data[i][j] = value++;

		// display the array contents using for loop
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[i].length; j++)
				System.out.print(data[i][j]);
		
		//multidimentional arrays to string with api
		
		System.out.println("Display arry data with Arrays: deepToString");
		System.out.println(Arrays.deepToString(data));
	
	}
}