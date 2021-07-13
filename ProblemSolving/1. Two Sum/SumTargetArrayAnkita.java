/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
*/		

package com.udemy.linkedlist.interview;

import java.util.HashMap;
import java.util.Map;


public class SumTargetArrayAnkita {
	
	public static void main(String[] args) {
		int[] result = twoSum(new int[]{3,2,4},6);
		for(int res : result){
			System.out.print(res);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer rem = map.get(target - nums[i]);
            if(rem != null){
                return new int[]{rem , i}; 
            }
            map.put(nums[i] , i);
        }
        return null;
    }

}
