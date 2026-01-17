
CheckIfArrayIsSortedAndRotated Array Is Sorted and Rotated
//  LeetCode: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

//  * Approach:
//  Count the number of "break points" where nums[i] > nums[i+1]
//  A sorted array has 0 break points
//  A sorted and rotated array has exactly 1 break point
//  More than 1 break point means array is not sorted and rotated
//  Use modulo (%) to check last element with first element
//  * 
//  Time Complexity: O(n) - Single pass through array
//  Space Complexity: O(1) - Only using counter variable
 
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) return false;
        }
        return true;
    }
}
