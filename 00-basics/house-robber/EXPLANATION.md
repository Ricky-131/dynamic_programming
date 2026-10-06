# House Robber

- **LeetCode:** [#198 - House Robber](https://leetcode.com/problems/house-robber/)
- **Topic:** `00-basics` / `1D DP`

---

### 1. Core Intuition
<!-- Brief description of the take vs skip decision -->

---

### 2. Recurrence Relation
<!-- State definition and transition formula -->
- **State Definition:** `dp[i] = ...`
- **Base Cases:** `dp[0] = ...`, `dp[1] = ...`
- **Transition Formula:** `dp[i] = max(dp[i-1], nums[i] + dp[i-2])`

---

### 3. Complexity Matrix

| Approach | Time Complexity | Space Complexity | Status |
| :--- | :---: | :---: | :---: |
| 1. Brute Force Recursion | $O(2^N)$ | $O(N)$ | TLE |
| 2. Top-Down (Memoization) | $O(N)$ | $O(N)$ | Accepted |
| 3. Bottom-Up (Tabulation) | $O(N)$ | $O(N)$ | Accepted |
| 4. Space-Optimized | $O(N)$ | $O(1)$ | Optimal |

---

### 4. Edge Cases & Key Takeaways
<!-- Important pitfalls (e.g. single house, zero houses) -->
