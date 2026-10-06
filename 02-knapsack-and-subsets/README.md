# 02. Knapsack, Subsets & Partitioning

## 📖 Overview
The **Knapsack Problem** is one of the most foundational patterns in Dynamic Programming. It deals with selecting a subset of items—each with a weight and a value—to maximize total value or achieve a specific target sum under capacity constraints.

---

## 🧭 The 3 Knapsack Variations

| Type | Item Constraint | 1D Space Loop Direction | Classic Examples |
| :--- | :--- | :--- | :--- |
| **0/1 Knapsack** | Each item used **at most once** | **Right-to-Left** ($W \to w_i$) | *0/1 Knapsack, Subset Sum, Equal Partition* |
| **Unbounded Knapsack** | Each item used **infinitely many times** | **Left-to-Right** ($w_i \to W$) | *Coin Change 1 & 2, Rod Cutting, Perfect Squares* |
| **Bounded Knapsack** | Each item has an exact count $c_i$ | Converted to 0/1 via binary splitting | *Bounded capacity packing* |

---

## ⚡ Core Patterns & Templates

### Pattern 1: 0/1 Knapsack (Take at most once)
- **State:** `dp[w]` = maximum value achievable with total weight $w$.
- **Critical Rule:** In the space-optimized 1D array, iterate the weight $w$ backwards ($W \to \text{wt}$) so you use the values from the *previous* item iteration and do not reuse the same item twice.

```python
# 0/1 Knapsack Template (O(W) Space)
def knapsack_01(weights: list[int], values: list[int], W: int) -> int:
    dp = [0] * (W + 1)
    for wt, val in zip(weights, values):
        # Iterate backwards to ensure each item is used at most once
        for w in range(W, wt - 1, -1):
            dp[w] = max(dp[w], dp[w - wt] + val)
    return dp[W]
```

---

### Pattern 2: Unbounded Knapsack (Infinite reuse)
- **State:** `dp[w]` = maximum value (or min coins) achievable for weight/amount $w$.
- **Critical Rule:** Iterate the weight $w$ forward ($\text{wt} \to W$) because an item can be chosen multiple times for the current subproblem.

```python
# Unbounded Knapsack / Coin Change (Min coins for target amount)
def coin_change_min(coins: list[int], amount: int) -> int:
    dp = [float('inf')] * (amount + 1)
    dp[0] = 0  # 0 coins needed for amount 0
    
    for c in coins:
        for a in range(c, amount + 1):  # Forward iteration
            dp[a] = min(dp[a], dp[a - c] + 1)
            
    return dp[amount] if dp[amount] != float('inf') else -1
```

---

### Pattern 3: Subset Sum / Partition DP (Boolean Existence)
- **Goal:** Determine if any subset equals target $S / 2$ (Equal Sum Partition).
- **Base Case:** `dp[0] = True` (empty subset has sum 0).

```python
def can_partition(nums: list[int]) -> bool:
    total = sum(nums)
    if total % 2 != 0:
        return False
    target = total // 2
    
    dp = [False] * (target + 1)
    dp[0] = True
    
    for num in nums:
        for s in range(target, num - 1, -1):
            dp[s] = dp[s] or dp[s - num]
            
    return dp[target]
```

---

### 🚨 Crucial Nuance: Combinations vs. Permutations

When counting the total number of ways to reach a target sum:

1. **Combinations (Order does NOT matter, e.g., Coin Change 2):**
   - Outer loop over **items/coins**, inner loop over **targets**.
   ```python
   for coin in coins:
       for target in range(coin, total + 1):
           dp[target] += dp[target - coin]
   ```
2. **Permutations (Order DOES matter, e.g., Combination Sum IV):**
   - Outer loop over **targets**, inner loop over **items/coins**.
   ```python
   for target in range(1, total + 1):
       for coin in coins:
           if target >= coin:
               dp[target] += dp[target - coin]
   ```

---

## 🎯 Summary Checklist
- [ ] Is total sum odd? (For Equal Partition, instantly return `False`).
- [ ] Can items be used more than once? $\rightarrow$ Forward loop.
- [ ] Can items be used only once? $\rightarrow$ Backward loop.
- [ ] Are we minimizing? Initialize with $+\infty$. Are we counting ways? Initialize $\text{dp}[0] = 1$.
