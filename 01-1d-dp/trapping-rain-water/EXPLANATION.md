# Trapping Rain Water

- **Reference / Link:** [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)
- **Topic:** `01-1d-dp`
- **Problem Summary:** Compute how much water can be trapped after raining using DP prefix/suffix max arrays

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
| 2. Top-Down (Memoization) | $O(N)$ | $O(N)$ | Accepted |
| 3. Bottom-Up (Tabulation) | $O(N)$ | $O(N)$ | Accepted |
| 4. Space-Optimized | $O(N)$ | $O(1)$ | Optimal |

---

### 4. Edge Cases & Key Takeaways
<!-- Important pitfalls, negative values, 0-index bounds -->
