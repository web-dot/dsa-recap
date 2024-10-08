package com.dsa.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    
    // 2798 target hours
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
    	int count = 0;
        for(int i=0; i<hours.length; i++){
        	if(hours[i] >= target) {
        		count++;
        	}
        }
        return count;
    }
    
    // 2824 count pairs
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
    	for(int i=0; i<nums.size(); i++) {
        	for(int j=i+1; j<nums.size(); j++) {
        		if((nums.get(i) + nums.get(j)) < target) {
        			count++;
        		}
        	}
        }
    	return count;
    }
    
    // optimized - using hash map
	public static int countPairsByMap(List<Integer> nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for(int num : nums) {
			int complement = target - num;
			if(map.containsKey(complement)) {
				System.out.println(complement);
				count += map.get(complement);
			}
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		return count;
	}
	
	
    
    
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(-1,1,2,3,1);
		System.out.println(countPairsByMap(arr, 2));
	}

}
