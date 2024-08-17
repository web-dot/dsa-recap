package com.dsa.array;

import java.util.Arrays;

public class ArrayEasyProblems {

	
	
	 //1470- shuffle array -> [2,5,1,3,4,7], n = 3 -> [2,3,5,4,1,7] 
    public static int[] shuffleAgain(int[] nums, int n) {
    	int[] newarr = new int[nums.length];
    	int k = 0;
    	for(int i=0; i < nums.length/2; i++) {
    		newarr[k] = nums[i];
    		k+=2;
    	}
    	int p1 = 1;
    	int p2 = n;
    	while(p1 < nums.length) {
    		if(newarr[p1] == 0) {
    			newarr[p1] = nums[p2];
    		}
    		p1+=2;
    		p2++;
    	}
    	return newarr;
    }
	
	public static void main(String[] args) {
		int[] arr = {2,5,1,3,4,7};
		System.out.println(Arrays.toString(shuffleAgain(arr, 3)));
	}

}
