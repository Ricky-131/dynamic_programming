# Longest Increasing Subsequence (LIS)

- **LeetCode:** [#300 - Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)
- **Topic:** `00-basics` / `LIS`

---

### 1. Core Intuition
<!-- Subsequence extension vs building a new one -->

---

### 2. Recurrence Relation
<!-- State definition and transition formula -->
- **State Definition:** `dp[i]` = length of LIS strictly ending at index `i`
- **Base Cases:** `dp[i] = 1` for all `i`
- **Transition Formula:** `dp[i] = 1 + max(dp[j])` for all `0 <= j < i` where `nums[j] < nums[i]`

---

### 3. Complexity Matrix

| Approach | Time Complexity | Space Complexity | Status |
| :--- | :---: | :---: | :---: |
| 1. Brute Force Recursion | $O(2^N)$ | $O(N)$ | TLE |
| 2. Top-Down (Memoization) | $O(N^2)$ | $O(N^2)$ | Accepted |
| 3. Bottom-Up (Tabulation) | $O(N^2)$ | $O(N)$ | Accepted |
| 4. Binary Search (Patience Sorting) | $O(N \log N)$ | $O(N)$ | Optimal |

---

### 4. Edge Cases & Key Takeaways
<!-- Empty array, duplicate elements (strictly increasing vs non-decreasing), all decreasing array -->
