# 01. 1D Dynamic Programming & Linear Optimization

## 📖 Overview
**1D Dynamic Programming** deals with problems where the state can be captured using a single index/parameter (usually array index $i$, target number $n$, or prefix length). The decision at index $i$ depends on a fixed or variable lookback window of previous states ($i-1, i-2, \dots$).

---

## 🧩 Primary 1D DP Patterns

### Pattern 1: Constant Lookback (Fibonacci / Stepping DP)
- **Concept:** State at $i$ depends on a fixed number of immediately preceding steps ($i-1, i-2, \dots, i-k$).
- **Recurrence Template:**
  $$\text{dp}[i] = \min(\text{dp}[i-1] + \text{cost}[i-1], \text{dp}[i-2] + \text{cost}[i-2])$$
- **Space Optimization:** Keep $k$ variables instead of an array of size $N \rightarrow O(1)$ extra space.
- **Classic Archetypes:** *Climbing Stairs*, *Min Cost Climbing Stairs*, *House Robber*.

```python
# Template: Constant lookback with O(1) space
def min_cost_climbing(cost: list[int]) -> int:
    prev2, prev1 = 0, 0
    for c in cost:
        curr = c + min(prev1, prev2)
        prev2, prev1 = prev1, curr
    return min(prev1, prev2)
```

---

### Pattern 2: Subarray Optimization (Kadane's DP Template)
- **Concept:** At each element $i$, decide whether to **extend** the existing subarray ending at $i-1$ or **start fresh** at $i$.
- **Recurrence Template:**
  $$\text{dp}[i] = \max(\text{nums}[i], \text{nums}[i] + \text{dp}[i-1])$$
- **Max Product Variation:** Keep track of both `max_ending_here` and `min_ending_here` because multiplying two negative numbers creates a positive product.
- **Classic Archetypes:** *Maximum Subarray*, *Maximum Product Subarray*, *Max Absolute Subarray Sum*, *Longest Turbulent Subarray*.

```python
# Template: Kadane's Maximum Subarray
def max_subarray(nums: list[int]) -> int:
    max_so_far = current_max = nums[0]
    for x in nums[1:]:
        current_max = max(x, current_max + x)
        max_so_far = max(max_so_far, current_max)
    return max_so_far
```

---

### Pattern 3: Variable Lookback / Prefix Partitioning DP
- **Concept:** To solve for prefix of length $i$, check all possible valid split points $j < i$.
- **Recurrence Template:**
  $$\text{dp}[i] = \min_{0 \le j < i} (\text{dp}[j] + \text{cost}(j \to i)) \quad \text{or} \quad \text{dp}[i] = \bigvee_{j} (\text{dp}[j] \land \text{valid}(j \dots i))$$
- **Time Complexity:** Typically $O(N^2)$ or $O(N \cdot K)$ where $K$ is the max partition length.
- **Classic Archetypes:** *Word Break*, *Decode Ways*, *Filling Bookcase Shelves*, *Min Cost Tickets*.

```python
# Template: Word Break Partitioning
def word_break(s: str, word_dict: set[str]) -> bool:
    n = len(s)
    dp = [False] * (n + 1)
    dp[0] = True  # Base case: empty string
    
    for i in range(1, n + 1):
        for j in range(i):
            if dp[j] and s[j:i] in word_dict:
                dp[i] = True
                break
    return dp[n]
```

---

### Pattern 4: State Machine / Modulo Remainder DP
- **Concept:** The state at step $i$ branches into multiple sub-states (e.g., remainder mod 3: `rem0, rem1, rem2`, or flags `bought/sold/cool`).
- **Recurrence Template:** Maintain an array of state transitions:
  $$\text{state}_k[i] = \text{transition}(\text{state}_0[i-1], \dots, \text{state}_m[i-1])$$
- **Classic Archetypes:** *Greatest Sum Divisible by Three*, *Highway Billboard*.

---

## 🛠️ Step-by-Step Problem Solving Checklist
1. **Identify the State:** Does `dp[i]` represent the best answer for the first $i$ elements, or the best answer *strictly ending* at index $i$?
2. **Handle Negative Numbers:** If products or differences are involved, maintain both `max_dp` and `min_dp`.
3. **Guard Boundary Conditions:** Check $i=0, i=1$ explicitly before running loops.
