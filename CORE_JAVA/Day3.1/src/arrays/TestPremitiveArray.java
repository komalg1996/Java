package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestPremitiveArray {

	public static void main(String[] args) {
		// create a scanner wrapping stdin
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		double[] data; // data : ref type:array type(holding double vals):
		//4/8/16 bytes will be memory allocated on stack
		data=new double[sc.nextInt()];//[D class will be loaded in method ares
		//display array data:def values
		System.out.print("Default contents of array via for loop");
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
		System.out.println();
		System.out.print("Default contents of array via for each loop");

		//to access arry elements : for-each
		//cant modify by for each AS it works with copy
		for(double d : data)//d=data[0]
			System.out.print(d+" ");
		
		//accept data from user(scanner) & store it in array : for loop
		for(int i=0;i<data.length;i++) {
			System.out.println("Enter double number");
			data[i]=sc.nextDouble();
		}
		System.out.print("Initialized contents of array via for each loop");
		for(double d : data)//d=data[0]
			System.out.print(d+" ");
		System.out.println();
		//to print array contents: java api : Arrays.toString
		System.out.println("Array contents "+Arrays.toString(data));
		//How to display name of class for an array object?
		System.out.println("ClassName for Array"+ data.getClass().getName()); //[D
		byte[][] b =new byte[4][3];
		System.out.println("ClassName for Array"+ b.getClass().getName()); //[[B

		
		sc.close();

	}

}
