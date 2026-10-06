# Box Stacking Problem

- **Reference / Link:** [Box Stacking Problem](https://www.geeksforgeeks.org/box-stacking-problem-dp-22/)
- **Topic:** `03-lis-and-subsequences`
- **Problem Summary:** Stack 3D boxes to achieve maximum height where lower boxes must have strictly larger base dimensions

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
