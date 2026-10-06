# Frog Jump

- **Reference / Link:** [Frog Jump](https://leetcode.com/problems/frog-jump/)
- **Topic:** `01-1d-dp`
- **Problem Summary:** Determine if frog can cross the river stepping on stones with jump k-1, k, k+1

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
