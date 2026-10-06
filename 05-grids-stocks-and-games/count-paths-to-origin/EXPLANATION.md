# Count Paths to Reach Origin

- **Reference / Link:** [Count Paths to Reach Origin](https://www.geeksforgeeks.org/counts-paths-point-reach-origin/)
- **Topic:** `05-grids-stocks-and-games`
- **Problem Summary:** Count number of paths to reach (0, 0) from (n, m) moving only down and left

---

### 1. Core Intuition
<!-- Brief 2-3 line description of how to break this problem down -->

---

### 2. Recurrence Relation
<!-- State definition and transition formula -->
- **State Definition:** `dp[r][c] = ...` (or `dp[i][j] = ...`)
- **Base Cases:** `dp[0][0] = ...`
- **Transition Formula:** `dp[r][c] = ...`

---

### 3. Complexity Matrix

| Approach | Time Complexity | Space Complexity | Status |
| :--- | :---: | :---: | :---: |
| 1. Brute Force Recursion | $O(2^{M+N})$ | $O(M+N)$ | TLE |
| 2. Top-Down (Memoization) | $O(M 	imes N)$ | $O(M 	imes N)$ | Accepted |
| 3. Bottom-Up (Tabulation) | $O(M 	imes N)$ | $O(M 	imes N)$ | Accepted |
| 4. Space-Optimized | $O(M 	imes N)$ | $O(N)$ | Optimal |

---

### 4. Edge Cases & Key Takeaways
<!-- Grid bounds, obstacles, single cell, player turn parity -->
