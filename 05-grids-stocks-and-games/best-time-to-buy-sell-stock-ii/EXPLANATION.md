# Best Time to Buy and Sell Stock II (Unlimited Transactions)

- **Reference / Link:** [Best Time to Buy and Sell Stock II (Unlimited Transactions)](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)
- **Topic:** `05-grids-stocks-and-games`
- **Problem Summary:** Find the maximum profit you can achieve with unlimited buy and sell transactions

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
