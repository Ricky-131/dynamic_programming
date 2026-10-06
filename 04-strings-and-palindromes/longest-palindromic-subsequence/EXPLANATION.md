# Longest Palindromic Subsequence

- **Reference / Link:** [Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/)
- **Topic:** `04-strings-and-palindromes`
- **Problem Summary:** Find the longest palindromic subsequence's length in s

---

### 1. Core Intuition
<!-- Brief 2-3 line description of how to break this problem down -->

---

### 2. Recurrence Relation
<!-- State definition and transition formula -->
- **State Definition:** `dp[i][j] = ...`
- **Base Cases:** `dp[0][j] = ...`
- **Transition Formula:** `dp[i][j] = ...`

---

### 3. Complexity Matrix

| Approach | Time Complexity | Space Complexity | Status |
| :--- | :---: | :---: | :---: |
| 1. Brute Force Recursion | $O(2^N)$ | $O(N)$ | TLE |
| 2. Top-Down (Memoization) | $O(N^2)$ | $O(N^2)$ | Accepted |
| 3. Bottom-Up (Tabulation) | $O(N^2)$ | $O(N^2)$ | Accepted |
| 4. Space-Optimized | $O(N^2)$ | $O(N)$ | Optimal |

---

### 4. Edge Cases & Key Takeaways
<!-- Empty strings, single char palindromes, case sensitivity -->
