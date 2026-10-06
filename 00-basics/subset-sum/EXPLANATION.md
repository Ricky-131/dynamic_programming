# Subset Sum Problem

- **Topic:** `00-basics` / `0/1 Knapsack`
- **Related LeetCode:** [#416 - Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/)

---

### 1. Core Intuition
<!-- Pick vs Don't Pick item `i` to achieve exact target sum -->

---

### 2. Recurrence Relation
<!-- State definition and transition formula -->
- **State Definition:** `dp[i][s]` = can we form sum `s` using a subset of first `i` elements?
- **Base Cases:** `dp[i][0] = true`, `dp[0][s] = false` for $s > 0$
- **Transition Formula:** `dp[i][s] = dp[i-1][s] || dp[i-1][s - nums[i-1]]` (if $s \ge \text{nums}[i-1]$)

---

### 3. Complexity Matrix

| Approach | Time Complexity | Space Complexity | Status |
| :--- | :---: | :---: | :---: |
| 1. Brute Force Recursion | $O(2^N)$ | $O(N)$ | TLE |
| 2. Top-Down (Memoization) | $O(N \times \text{Target})$ | $O(N \times \text{Target})$ | Accepted |
| 3. Bottom-Up (Tabulation) | $O(N \times \text{Target})$ | $O(N \times \text{Target})$ | Accepted |
| 4. Space-Optimized (1D) | $O(N \times \text{Target})$ | $O(\text{Target})$ | Optimal |

---

### 4. Edge Cases & Key Takeaways
<!-- Right-to-left 1D array traversal direction, target == 0, odd sum checks -->
