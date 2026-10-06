# Coin Change (Minimum Coins)

- **LeetCode:** [#322 - Coin Change](https://leetcode.com/problems/coin-change/)
- **Topic:** `00-basics` / `Unbounded Knapsack`

---

### 1. Core Intuition
<!-- Infinite supply of each coin: how to build the minimum count for each sub-amount -->

---

### 2. Recurrence Relation
<!-- State definition and transition formula -->
- **State Definition:** `dp[a] = min coins needed for amount a`
- **Base Cases:** `dp[0] = 0`, `dp[1...amount] = INF`
- **Transition Formula:** `dp[a] = min(dp[a], dp[a - c] + 1)` for all `c in coins` where `a >= c`

---

### 3. Complexity Matrix

| Approach | Time Complexity | Space Complexity | Status |
| :--- | :---: | :---: | :---: |
| 1. Brute Force Recursion | $O(S^N)$ | $O(A)$ | TLE |
| 2. Top-Down (Memoization) | $O(N × A)$ | $O(A)$ | Accepted |
| 3. Bottom-Up (Tabulation) | $O(N × A)$ | $O(A)$ | Accepted |
| 4. Space-Optimized (1D) | $O(N × A)$ | $O(A)$ | Optimal |

---

### 4. Edge Cases & Key Takeaways
<!-- Target amount == 0, impossible amount (return -1), forward loop direction for Unbounded Knapsack -->
