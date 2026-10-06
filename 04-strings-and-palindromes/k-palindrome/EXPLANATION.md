# K-Palindrome or Not

- **Reference / Link:** [K-Palindrome or Not](https://www.geeksforgeeks.org/find-if-string-is-k-palindrome-or-not-set-2/)
- **Topic:** `04-strings-and-palindromes`
- **Problem Summary:** Determine if string can be transformed into palindrome by removing at most k characters

---

### 1. Core Intuition
<!-- Brief 2-3 line description of how to break this problem down -->

---

### 2. Recurrence Relation
<!-- State definition and transition formula -->
- **State Definition:** `dp[i][j] = ...`
- **Base Cases:** `dp[0][j] = ...`
- **Transition Formula:** `dp[i][j] = ...`

---

### 3. Complexity Matrix

| Approach | Time Complexity | Space Complexity | Status |
| :--- | :---: | :---: | :---: |
| 1. Brute Force Recursion | $O(2^N)$ | $O(N)$ | TLE |
| 2. Top-Down (Memoization) | $O(N^2)$ | $O(N^2)$ | Accepted |
| 3. Bottom-Up (Tabulation) | $O(N^2)$ | $O(N^2)$ | Accepted |
| 4. Space-Optimized | $O(N^2)$ | $O(N)$ | Optimal |

---

### 4. Edge Cases & Key Takeaways
<!-- Empty strings, single char palindromes, case sensitivity -->
