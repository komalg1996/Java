package practice;
import java.io.*;
//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/submissions/870637234/
public class FinalValue {

	public static void main(String[] args) {
		String[] operations = { "++X", "++X", "X++" };
		System.out.println(finalValueAfterOperations(operations));
	}

	public static int finalValueAfterOperations(String[] operations) {
		int X = 0;
		int sum = 0;
		for (int i = 0; i < operations.length; i++) {
			if (operations[i].charAt(0) == '+') {
				sum++;
			} else if (operations[i].charAt(0) == '-') {
				sum--;
			} else if (operations[i].charAt(0) == 'X' && operations[i].charAt(1) == '+') {
				sum++;
			} else
				sum--;
		}
		return sum;
	}
}
