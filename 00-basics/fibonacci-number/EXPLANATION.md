# Fibonacci Number

- **LeetCode:** [#509 - Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)
- **Topic:** `00-basics` / `1D DP`

---

### 1. Core Intuition
<!-- Brief 2-3 line description of how to break this problem down -->

---

### 2. Recurrence Relation
<!-- State definition and transition formula -->
- **State Definition:** `F(n) = ...`
- **Base Cases:** `F(0) = 0`, `F(1) = 1`
- **Transition Formula:** `F(n) = F(n-1) + F(n-2)`

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
<!-- Important pitfalls or base cases -->
