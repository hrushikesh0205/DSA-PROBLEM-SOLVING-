// Move Zeroes
// LeetCode: https://leetcode.com/problems/move-zeroes/

/*
 * Approach:
 * - Traverse the array and move all non-zero elements to the front
 * - Maintain a pointer (count) to track the position for non-zero elements
 * - After placing all non-zero elements, fill the remaining positions with 0
 * - This maintains the relative order of non-zero elements
 *
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(1) - In-place solution, no extra space used
 */

class Solution {
    public void moveZeroes(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }
    }
}
