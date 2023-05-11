package Extra;

import java.util.Arrays;

public class MyString {

	public static String upFirst(String s) {
		String newS="";
		String []ch=s.split(" ");
		for(String w :ch) {
			String first= w.substring(0, 1);
			String other= w.substring(1);
			newS=newS+first.toUpperCase()+other+" ";
			
			
		}
		
		return newS;
	}
	
	public static void main(String[] args) {
		String s = "i am placed in dassault systems";
		System.out.println(upFirst(s));
	}

}
