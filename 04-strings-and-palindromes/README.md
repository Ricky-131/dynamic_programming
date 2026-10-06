# 04. String Dynamic Programming, LCS & Palindromes

## 📖 Overview
String DP problems typically compare two strings $S_1$ and $S_2$, transform one string into another, or evaluate substrings/subsequences within a single string (such as palindromes).

---

## 🏛️ The Core LCS Pattern (Longest Common Subsequence)

### 1. Matrix State Definition
- Let `dp[i][j]` = length of LCS between prefix $S_1[0 \dots i-1]$ and prefix $S_2[0 \dots j-1]$.
- **Base Case:** `dp[0][j] = 0` and `dp[i][0] = 0` (comparison with empty string).

### 2. Recurrence Relation
$$\text{dp}[i][j] = \begin{cases} 1 + \text{dp}[i-1][j-1] & \text{if } S_1[i-1] == S_2[j-1] \\ \max(\text{dp}[i-1][j], \, \text{dp}[i][j-1]) & \text{if } S_1[i-1] \ne S_2[j-1] \end{cases}$$

```python
# Standard LCS Template (O(M * N) Time, O(min(M, N)) Space)
def longest_common_subsequence(text1: str, text2: str) -> int:
    m, n = len(text1), len(text2)
    # Space optimized: only keep previous and current row
    prev = [0] * (n + 1)
    
    for i in range(1, m + 1):
        curr = [0] * (n + 1)
        for j in range(1, n + 1):
            if text1[i - 1] == text2[j - 1]:
                curr[j] = 1 + prev[j - 1]
            else:
                curr[j] = max(prev[j], curr[j - 1])
        prev = curr
        
    return prev[n]
```

---

## ✂️ Substring vs. Subsequence
- **Subsequence (Non-contiguous):** If mismatch, carry over previous max: $\max(\text{dp}[i-1][j], \text{dp}[i][j-1])$.
- **Substring (Contiguous):** If mismatch, **reset to 0**: $\text{dp}[i][j] = 0$.

---

## 🔄 Palindromic DP Patterns

### 1. Longest Palindromic Subsequence (LPS)
- **Insight:** LPS of string $S$ is simply $\text{LCS}(S, \text{reverse}(S))$.
- **Interval DP Form:** `dp[i][j]` = LPS in substring $S[i \dots j]$.
  $$\text{dp}[i][j] = \begin{cases} 2 + \text{dp}[i+1][j-1] & \text{if } S[i] == S[j] \\ \max(\text{dp}[i+1][j], \, \text{dp}[i][j-1]) & \text{if } S[i] \ne S[j] \end{cases}$$

### 2. Palindrome Partitioning (Min Cuts)
- **State:** `dp[i]` = min cuts needed to partition prefix $S[0 \dots i-1]$ into palindromes.
- **Recurrence:**
  $$\text{dp}[i] = \min_{0 \le j < i, \, \text{is\_palindrome}(S[j \dots i-1])} (\text{dp}[j] + 1)$$
- Base case: `dp[0] = -1` (0 cuts for 1-char string).

```python
# Palindrome Partitioning II (Min Cuts)
def min_cut_palindrome(s: str) -> int:
    n = len(s)
    # Precompute is_pal table
    is_pal = [[False] * n for _ in range(n)]
    for r in range(n):
        for l in range(r + 1):
            if s[l] == s[r] and (r - l <= 2 or is_pal[l + 1][r - 1]):
                is_pal[l][r] = True
                
    dp = [float('inf')] * (n + 1)
    dp[0] = -1
    
    for i in range(1, n + 1):
        for j in range(i):
            if is_pal[j][i - 1]:
                dp[i] = min(dp[i], dp[j] + 1)
                
    return dp[n]
```

---

## ✏️ Edit Distance Template (Levenshtein Distance)
- Minimum operations (Insert, Delete, Replace) to convert $S_1 \to S_2$:
$$\text{dp}[i][j] = \begin{cases} \text{dp}[i-1][j-1] & \text{if } S_1[i-1] == S_2[j-1] \\ 1 + \min(\text{dp}[i-1][j], \, \text{dp}[i][j-1], \, \text{dp}[i-1][j-1]) & \text{if mismatch} \end{cases}$$
- `dp[i-1][j]` $\rightarrow$ Delete from $S_1$.
- `dp[i][j-1]` $\rightarrow$ Insert into $S_1$.
- `dp[i-1][j-1]` $\rightarrow$ Replace character in $S_1$.
