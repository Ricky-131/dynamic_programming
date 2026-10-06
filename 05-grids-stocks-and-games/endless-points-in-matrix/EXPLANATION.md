# Find Number of Endless Points in a Matrix

- **Reference / Link:** [Find Number of Endless Points in a Matrix](https://www.geeksforgeeks.org/find-number-endless-points-matrix/)
- **Topic:** `05-grids-stocks-and-games`
- **Problem Summary:** A point (r, c) is endless if we can reach both right and bottom borders through cells containing 1

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
| 2. Top-Down (Memoization) | $O(M × N)$ | $O(M × N)$ | Accepted |
| 3. Bottom-Up (Tabulation) | $O(M × N)$ | $O(M × N)$ | Accepted |
| 4. Space-Optimized | $O(M × N)$ | $O(N)$ | Optimal |

---

### 4. Edge Cases & Key Takeaways
<!-- Grid bounds, obstacles, single cell, player turn parity -->
