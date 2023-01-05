//https://leetcode.com/problems/find-common-characters/
package practice;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

	public static void main(String[] args) {
		String []words = {"bella","label","roller"};
		System.out.println(commonChars(words));

	}
	 public static List<String> commonChars(String[] words) {
		 ArrayList<String> list=new ArrayList<String>();
		 for(int i=0;i<words.length;i++) {		//for string 
			 
			 for(int j=0;j<words[i].length();j++) {
				 char c= words[i].charAt(j);
				 
				 
			 }
			 
		 }
		return list;
	        
	    }
}
