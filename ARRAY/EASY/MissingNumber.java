    // Missing Number
// LeetCode: https://leetcode.com/problems/missing-number/

/*
 * Approach:
 * - Calculate the expected sum of numbers from 0 to n using formula n*(n+1)/2
 * - Calculate the actual sum of elements in the array
 * - The missing number is the difference between expected sum and actual sum
 *
 * Example:
 * nums = [3,0,1]
 * Expected sum (0 to 3) = 6
 * Actual sum = 4
 * Missing number = 6 - 4 = 2
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int missingNumber(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        int actualSum = (nums.length * (nums.length + 1)) / 2;
        int missingNumber = actualSum - sum;

        return missingNumber;
    }
}
