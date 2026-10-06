# Longest Common Subsequence (LCS)

- **LeetCode:** [#1143 - Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)
- **Topic:** `00-basics` / `LCS & Strings`

---

### 1. Core Intuition
<!-- Two-string character comparison matrix matching -->

---

### 2. Recurrence Relation
<!-- State definition and transition formula -->
- **State Definition:** `dp[i][j]` = length of LCS between `text1[0...i-1]` and `text2[0...j-1]`
- **Base Cases:** `dp[0][j] = 0`, `dp[i][0] = 0`
- **Transition Formula:**
  - If `text1[i-1] == text2[j-1]`: `dp[i][j] = 1 + dp[i-1][j-1]`
  - If `text1[i-1] != text2[j-1]`: `dp[i][j] = max(dp[i-1][j], dp[i][j-1])`

---

### 3. Complexity Matrix

| Approach | Time Complexity | Space Complexity | Status |
| :--- | :---: | :---: | :---: |
| 1. Brute Force Recursion | $O(2^{M+N})$ | $O(M+N)$ | TLE |
| 2. Top-Down (Memoization) | $O(M × N)$ | $O(M × N)$ | Accepted |
| 3. Bottom-Up (Tabulation) | $O(M × N)$ | $O(M × N)$ | Accepted |
| 4. Space-Optimized (2-Row) | $O(M × N)$ | $O(\min(M, N))$ | Optimal |

---

### 4. Edge Cases & Key Takeaways
<!-- Empty strings, no common characters, identical strings -->
