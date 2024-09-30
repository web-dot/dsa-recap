package com.dsa.sorting;

import java.util.Arrays;

public class SortingAlgos {
	
	// bubble sort
	// insertion sort
	// selection sort
	
	public static int[] bubbleSort(int[] nums) {
		for(int i = 0; i < nums.length-1; i++) {
			int flag = 0;
			for(int j = 0; j < nums.length-1; j++) {
				if(nums[j+1] < nums[j]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					flag = 1;
				}
			}
			System.out.println(Arrays.toString(nums));
			if(flag == 0) {
				break;
			}
		}
		return nums;
	}
	
	public static int[] selectionSort(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			int min = i;
			for(int j=i+1; j<nums.length; j++) {
				if(nums[j] < nums[min]) {
					min = j;
				}
			}
			if(min != i) {
				int temp = nums[i];
				nums[i] = nums[min];
				nums[min] = temp;
			}
		}
		return nums;
	}
	
	/**
	 * -make first element as sorted
	 * -for each unsorted element X
	 * -extract the element X
	 * -for j = lastSortedIndex down to 0
	 * -	if current element j > X
	 * - 	move sorted element to the right by 1
	 * - break loop and insert X here
	 * */
	
	public static int[] insertionSort(int[] nums) {
		// 2, 9, 1, 5, 6
		for(int i=0; i<nums.length; i++) {
			int temp = nums[i];
			int j = i - 1;
			while(j >= 0 && nums[j] > temp) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = temp;
		}
		return nums;
	}
	
	
	
	public static void main(String args[]) {
		int[] nums = {2, 9, 1, 5, 6};
		System.out.println(Arrays.toString(insertionSort(nums)));
	}
}
