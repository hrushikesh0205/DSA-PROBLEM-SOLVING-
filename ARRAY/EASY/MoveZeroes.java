// Move Zeroes
// LeetCode: https://leetcode.com/problems/move-zeroes/

/*
 * Approach:
 * - Use a counter to track the position of non-zero elements
 * - Traverse the array and place non-zero elements at the front
 * - After placing all non-zero elements, fill the remaining positions with zeroes
 * - Maintains relative order of non-zero elements

 * Time Complexity: O(n)
 * Space Complexity: O(1)
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
