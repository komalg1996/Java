package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestDynamicInitArr {



		public static void main(String[] args) {
			//array of primitive types
			int[] data= {10,20,30,40,50};
			System.out.println("ArrayContents: "+Arrays.toString(data));
			System.out.println("Name of loaded class in method area: "+data.getClass().getName());	//[I
			Scanner sc= new Scanner(System.in);
			System.out.println("loaded class for scanner : "+ sc.getClass().getName());	//java.util.Scanner
		
			//dyn init of array of refs
			//Box[] boxes= {new Box(1,2,3),new Box(4,5,6),new Box(7,8,9)};
		
		
		
		
		}

	}


