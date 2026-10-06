# 03. Longest Increasing Subsequence (LIS) & Subsequences

## 📖 Overview
The **Longest Increasing Subsequence (LIS)** family of problems revolves around finding the length (or optimal score) of a subsequence of a given sequence in which elements are in strictly increasing (or non-decreasing) order. Subsequence elements do **not** need to be contiguous in the original array.

---

## ⚡ The Two Fundamental Approaches

### 1. Classic $O(N^2)$ Dynamic Programming
- **State:** `dp[i]` = length of the longest increasing subsequence that **ends at index $i$**.
- **Recurrence Relation:**
  $$\text{dp}[i] = 1 + \max_{0 \le j < i, \, \text{nums}[j] < \text{nums}[i]} (\text{dp}[j])$$
- **Base Case:** Every single element is an increasing subsequence of length 1 $\rightarrow$ `dp = [1] * n`.

```python
# Classic O(N^2) DP
def length_of_lis(nums: list[int]) -> int:
    if not nums:
        return 0
    n = len(nums)
    dp = [1] * n
    
    for i in range(1, n):
        for j in range(i):
            if nums[j] < nums[i]:
                dp[i] = max(dp[i], dp[j] + 1)
                
    return max(dp)
```

---

### 2. $O(N \log N)$ Binary Search Optimization (Patience Sorting)
- **Concept:** Maintain an array `tails` where `tails[k]` stores the **smallest tail element** of all increasing subsequences of length $k + 1$ found so far.
- For each number $x$ in `nums`:
  - If $x$ is greater than all elements in `tails`, append $x$.
  - Otherwise, replace the smallest element in `tails` that is $\ge x$ using binary search (`bisect_left`).
- **Result:** `len(tails)` is the length of the LIS.

```python
import bisect

def length_of_lis_fast(nums: list[int]) -> int:
    tails = []
    for x in nums:
        idx = bisect.bisect_left(tails, x)
        if idx == len(tails):
            tails.append(x)
        else:
            tails[idx] = x
    return len(tails)
```

---

## 🎯 Major LIS Variations & Techniques

### 1. Longest Bitonic Subsequence (Increasing then Decreasing)
- Compute LIS from left to right: `lis[i]`.
- Compute LDS (Longest Decreasing Subsequence) from right to left: `lds[i]`.
- Peak point maximizes: $\max_i (\text{lis}[i] + \text{lds}[i] - 1)$.

### 2. Maximum Sum Increasing Subsequence
- Instead of tracking length $+1$, track sum:
  $$\text{dp}[i] = \text{nums}[i] + \max_{j < i, \, \text{nums}[j] < \text{nums}[i]}(\text{dp}[j])$$

### 3. Sorting First to Unlock LIS (Russian Doll Envelopes / Box Stacking)
- When dealing with 2D objects $[w, h]$:
  1. Sort width **ascending**, and height **descending** for ties.
  2. Run standard 1D LIS on the heights.
  *(Sorting height descending prevents picking two envelopes with the same width!)*

### 4. Largest Divisible Subset
- Sort array first ($a \mid b \land b \mid c \implies a \mid c$).
- Apply standard LIS transition checking `nums[i] % nums[j] == 0`.

---

## 💡 How to Reconstruct the Actual Subsequence
To output the actual elements forming the optimal subsequence, keep a `parent` array storing the index of the predecessor:

```python
def get_actual_lis(nums: list[int]) -> list[int]:
    n = len(nums)
    dp = [1] * n
    parent = [-1] * n
    max_idx = 0
    
    for i in range(1, n):
        for j in range(i):
            if nums[j] < nums[i] and dp[j] + 1 > dp[i]:
                dp[i] = dp[j] + 1
                parent[i] = j
        if dp[i] > dp[max_idx]:
            max_idx = i
            
    # Backtrack path
    result = []
    curr = max_idx
    while curr != -1:
        result.append(nums[curr])
        curr = parent[curr]
    return result[::-1]
```
