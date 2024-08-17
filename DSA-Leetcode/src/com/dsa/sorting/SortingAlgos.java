package com.dsa.sorting;

import java.util.Arrays;

public class SortingAlgos {
	
	// bubble sort
	// insertion sort
	// selection sort
	
	public static int[] bubbleSort(int[] nums) {
		int pass = 1;
		System.out.println(Arrays.toString(nums));
		for(int i = 0; i < nums.length-1; i++) {
			for(int j = 0; j < nums.length-1; j++) {
				if(nums[j+1] < nums[j]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
				System.out.println("sorting - " + Arrays.toString(nums));
			}
			System.out.println(pass + " pass" + " : " + Arrays.toString(nums));
			pass++;
		}
		return nums;
	}
	
	
	
	public static void main(String args[]) {
		int[] nums = {5, 2, 9, 1, 5, 6};
		System.out.println(Arrays.toString(bubbleSort(nums)));
	}
}
