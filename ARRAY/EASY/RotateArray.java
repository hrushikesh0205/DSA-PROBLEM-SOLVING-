// Rotate Array
// LeetCode: https://leetcode.com/problems/rotate-array/

/*
 * Approach:
 * - Use Reversal Algorithm
 * - First reverse the entire array
 * - Reverse first k elements
 * - Reverse remaining n-k elements
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
