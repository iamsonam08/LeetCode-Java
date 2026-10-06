/*
Question:
Given an integer array nums and an integer val, remove all occurrences
of val in-place and return the number of elements that are not equal to val.

Approach:
Use a two-pointer approach. Traverse the array and whenever an element
is not equal to val, place it at index k and increment k.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
