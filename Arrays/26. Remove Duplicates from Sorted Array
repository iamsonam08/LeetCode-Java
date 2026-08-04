/*
Problem: 26. Remove Duplicates from Sorted Array
Difficulty: Easy

Approach:

- Use two pointers.
- One pointer keeps track of unique elements.
- The other pointer scans the array.
- If a new unique element is found, place it after the last unique element.

Time Complexity: O(n)

Space Complexity: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

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
