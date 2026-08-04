/*
Problem: 349. Intersection of Two Arrays
Difficulty: Easy

Approach:

- Store all elements of nums1 in a HashSet.
- Traverse nums2.
- If an element is present in the HashSet, add it to another HashSet.
- Convert the HashSet into an array.

Time Complexity: O(m + n)

Space Complexity: O(m + n)
*/

import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;

        for (int num : result) {
            ans[i] = num;
            i++;
        }

        return ans;
    }
}
