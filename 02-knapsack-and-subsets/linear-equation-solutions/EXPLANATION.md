# Linear Equation of N Variables (Non-negative Solutions)

- **Reference / Link:** [Linear Equation of N Variables (Non-negative Solutions)](https://www.geeksforgeeks.org/find-number-of-solutions-of-a-linear-equation-of-n-variables/)
- **Topic:** `02-knapsack-and-subsets`
- **Problem Summary:** Find the number of non-negative integer solutions to coeff[0]*x1 + ... + coeff[n-1]*xn = rhs

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
