# Make Array Strictly Increasing

- **Reference / Link:** [Make Array Strictly Increasing](https://leetcode.com/problems/make-array-strictly-increasing/)
- **Topic:** `03-lis-and-subsequences`
- **Problem Summary:** Return minimum number of operations to make arr1 strictly increasing by replacing elements with elements from arr2

---

### 1. Core Intuition
<!-- Brief 2-3 line description of how to break this problem down -->

---

### 2. Recurrence Relation
<!-- State definition and transition formula -->
- **State Definition:** `dp[i] = ...`
- **Base Cases:** `dp[0] = ...`
- **Transition Formula:** `dp[i] = ...`

---

### 3. Complexity Matrix

| Approach | Time Complexity | Space Complexity | Status |
| :--- | :---: | :---: | :---: |
| 1. Brute Force Recursion | $O(2^N)$ | $O(N)$ | TLE |
| 2. Top-Down (Memoization) | $O(N^2)$ | $O(N^2)$ | Accepted |
| 3. Bottom-Up (Tabulation) | $O(N^2)$ | $O(N)$ | Accepted |
| 4. Binary Search / Optimal | $O(N \log N)$ | $O(N)$ | Optimal |

---

### 4. Edge Cases & Key Takeaways
<!-- Strictly increasing vs non-decreasing, empty input, single element -->
