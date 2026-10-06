# Ugly Numbers (Check / Find)

- **Reference / Link:** [Ugly Numbers (Check / Find)](https://www.geeksforgeeks.org/ugly-numbers/)
- **Topic:** `02-knapsack-and-subsets`
- **Problem Summary:** Find the nth number whose only prime factors are 2, 3 or 5

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
| 2. Top-Down (Memoization) | $O(N × W)$ | $O(N × W)$ | Accepted |
| 3. Bottom-Up (Tabulation) | $O(N × W)$ | $O(N × W)$ | Accepted |
| 4. Space-Optimized | $O(N × W)$ | $O(W)$ | Optimal |

---

### 4. Edge Cases & Key Takeaways
<!-- Capacity 0, negative values, 1D array loop direction -->
