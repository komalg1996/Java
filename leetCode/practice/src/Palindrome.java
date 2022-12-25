

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check palindrome");
		int num = sc.nextInt();
		System.out.println("Is Palindrome: " + isPalindrome(num));

	}

	public static boolean isPalindrome(int x) {
		int temp = x;
		int sum = 0;
		while (x > 0) {
			int rem = x % 10;
			x = x / 10;
			sum = (sum * 10) + rem;
		}
		if (temp == sum)
			return true;
		return false;
	}

}
