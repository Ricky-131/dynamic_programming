# Maximum Length of Pair Chain

- **Reference / Link:** [Maximum Length of Pair Chain](https://leetcode.com/problems/maximum-length-of-pair-chain/)
- **Topic:** `03-lis-and-subsequences`
- **Problem Summary:** Find the longest chain of pairs (a, b) -> (c, d) where b < c

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
