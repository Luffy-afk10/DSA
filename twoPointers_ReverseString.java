// Pattern
// Two-pointer technique (swapping characters from both ends)

// Problem
// Reverse the given character array in-place without using extra space.

// Core idea
// Use two pointers: one starting at the beginning (l) and one at the end (r).
// Swap the characters at l and r.
// Move l forward and r backward until they meet or cross.
// This ensures the string is reversed in-place.

// Time
// O(n) — each character is visited at most once during the swaps.

// Space
// O(1) — only a temporary variable is used for swapping, no extra data structures.
class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;
        while(l<=r){
            
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
