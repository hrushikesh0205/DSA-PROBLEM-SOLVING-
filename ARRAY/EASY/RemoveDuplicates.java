// Remove Duplicates from Sorted Array
// LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

/*
 * Approach:
 * - Use Two Pointer technique
 * - Pointer i keeps track of the index of unique elements
 * - Pointer j scans the array from index 1 to end
 * - Since array is already sorted:
 *   - If nums[i] != nums[j], it means a new unique element is found
 *   - Increment i and place nums[j] at nums[i]
 * - Finally, first (i + 1) elements will be unique
 *
 * Time Complexity: O(n)  -> Single pass through the array
 * Space Complexity: O(1) -> In-place modification, no extra space used
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
