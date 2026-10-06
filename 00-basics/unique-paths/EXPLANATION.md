# Unique Paths

- **LeetCode:** [#62 - Unique Paths](https://leetcode.com/problems/unique-paths/)
- **Topic:** `00-basics` / `2D Grid DP`

---

### 1. Core Intuition
<!-- Moving only right and down in an m x n grid -->

---

### 2. Recurrence Relation
<!-- State definition and transition formula -->
- **State Definition:** `dp[r][c]` = number of unique paths to reach cell `(r, c)` from `(0, 0)`
- **Base Cases:** `dp[0][c] = 1`, `dp[r][0] = 1`
- **Transition Formula:** `dp[r][c] = dp[r-1][c] + dp[r][c-1]`

---

### 3. Complexity Matrix

| Approach | Time Complexity | Space Complexity | Status |
| :--- | :---: | :---: | :---: |
| 1. Brute Force Recursion | $O(2^{M+N})$ | $O(M+N)$ | TLE |
| 2. Top-Down (Memoization) | $O(M × N)$ | $O(M × N)$ | Accepted |
| 3. Bottom-Up (Tabulation) | $O(M × N)$ | $O(M × N)$ | Accepted |
| 4. Space-Optimized (1D Row) | $O(M × N)$ | $O(N)$ | Optimal |

---

### 4. Edge Cases & Key Takeaways
<!-- 1x1 grid, 1xN grid, Combinatorics formula: C(m+n-2, m-1) -->
