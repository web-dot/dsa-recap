package com.dsa.string;

public class StringProblems {

	
	//151 - Given an input string s, reverse the order of the words
	public static String reverseWords(String s) {
        String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=arr.length-1; i>=0; i--) {
			if(!arr[i].isEmpty()) {				
				sb.append(arr[i]);
				sb.append(" ");
			}
		}
		return sb.toString().trim();
    }
	
	
	public static void main(String[] args) {
		System.out.print(reverseWords("a good   example"));
//		System.out.print("that");
	}
}
