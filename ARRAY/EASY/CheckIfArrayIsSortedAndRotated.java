
CheckIfArrayIsSortedAndRotated Array Is Sorted and Rotated
//  LeetCode: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
//  Difficulty: Easy
 
//  Problem Statement:
//  Given an array nums, return true if the array was originally sorted in 
//  non-decreasing order, then rotated some number of positions (including zero).
//   Otherwise, return false.
  
//  Example 1:
//  Input: nums = [3,4,5,1,2]
//  Output: true
//   Explanation: [1,2,3,4,5] is the original sorted array, rotated 3 times.
//  * 
// Example 2:
//  Input: nums = [2,1,3,4]
//   Output: false
  
//  * Approach:
//  Count the number of "break points" where nums[i] > nums[i+1]
//  A sorted array has 0 break points
//  A sorted and rotated array has exactly 1 break point
//  More than 1 break point means array is not sorted and rotated
//  Use modulo (%) to check last element with first element
//  * 
//  Time Complexity: O(n) - Single pass through array
//  Space Complexity: O(1) - Only using counter variable
 

public boolean check(int[] nums) {
    int count = 0;
    int n = nums.length;
    
    for(int i = 0; i < n; i++) {
        if(nums[i] > nums[(i + 1) % n]) {
            count++;
        }    
        if(count > 1) {
            return false;
        }
    }
        return true;
}