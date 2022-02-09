/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/

/* The following code runs in O(n*n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                    if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
} 
*/

//The following code runs in O(n)
import java.util.*;
class TwoSum {
    public static void main(String[] args){
        int[]  nums={5,4,6,7,1,2,3,9,8};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int required = target - nums[i];
            if(map.containsKey(required)) {
                return new int[]{map.get(required), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}