// Pattern
// Two-pointer technique on a sorted array

// Problem
// Given a sorted array of integers and a target value,
// find two numbers such that they add up to the target.
// Return their 1-based indices.

// Core idea
// Start with two pointers: one at the beginning (l) and one at the end (r).
// Calculate the sum of numbers[l] + numbers[r].
// If the sum is greater than target, move the right pointer leftward.
// If the sum is smaller than target, move the left pointer rightward.
// If the sum equals target, return the indices (l+1, r+1).

// Time
// O(n) — each element is visited at most once by either pointer.

// Space
// O(1) — only a few variables are used regardless of input size.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        int sum = 0;
        while(l<r){
            sum = numbers[l] + numbers[r];
            if(sum > target){
                r--;
            }
            else if(sum<target){
                l++;
            }
            else{
                return new int[] {l+1,r+1};
            }
        }
        return new int[] {};
    }
}
