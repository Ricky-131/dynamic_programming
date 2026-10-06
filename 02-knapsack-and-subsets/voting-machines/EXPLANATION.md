# Find if N People Can Vote on 2 Machines

- **Reference / Link:** [Find if N People Can Vote on 2 Machines](https://www.geeksforgeeks.org/find-whether-it-is-possible-to-finish-voting-on-two-machines-within-given-time-limit/)
- **Topic:** `02-knapsack-and-subsets`
- **Problem Summary:** Determine if voting can finish within time T across 2 parallel machines (Subset Sum variation)

---

### 1. Core Intuition
<!-- Brief 2-3 line description of how to break this problem down -->

---

### 2. Recurrence Relation
<!-- State definition and transition formula -->
- **State Definition:** `dp[i][w] = ...`
- **Base Cases:** `dp[0][w] = ...`
- **Transition Formula:** `dp[i][w] = ...`

---

### 3. Complexity Matrix

| Approach | Time Complexity | Space Complexity | Status |
| :--- | :---: | :---: | :---: |
| 1. Brute Force Recursion | $O(2^N)$ | $O(N)$ | TLE |
| 2. Top-Down (Memoization) | $O(N 	imes W)$ | $O(N 	imes W)$ | Accepted |
| 3. Bottom-Up (Tabulation) | $O(N 	imes W)$ | $O(N 	imes W)$ | Accepted |
| 4. Space-Optimized | $O(N 	imes W)$ | $O(W)$ | Optimal |

---

### 4. Edge Cases & Key Takeaways
<!-- Capacity 0, negative values, 1D array loop direction -->
