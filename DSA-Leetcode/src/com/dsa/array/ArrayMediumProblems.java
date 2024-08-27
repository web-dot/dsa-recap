package com.dsa.array;

public class ArrayMediumProblems {

	/**
	 * 53 - Given an integer array nums, find the 
	 * subarray with the largest sum, and return its sum.
	 * */
	
	public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int currSum = 0;
        for(int n : nums) {
        	currSum = Math.max(currSum, 0);
        	currSum += n;
        	result = Math.max(result, currSum);
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[] nums = {5,4,-1,7,8};
		System.out.println(maxSubArray(nums));
	}
}
