# 00. Dynamic Programming — Foundations & Core Principles

## 📖 Introduction to Dynamic Programming
**Dynamic Programming (DP)** is an optimization technique used to solve complex problems by breaking them down into smaller, overlapping subproblems, solving each subproblem once, and storing their solutions (memoization or tabulation) to avoid redundant computation.

---

## 🔑 The Two Prerequisites for DP
A problem can be solved using Dynamic Programming if and only if it exhibits two core properties:

1. **Optimal Substructure:**
   - The optimal solution to the overall problem can be constructed from the optimal solutions to its subproblems.
   - *Example:* Shortest path from $A \to C$ via $B$ = $(\text{Shortest } A \to B) + (\text{Shortest } B \to C)$.
2. **Overlapping Subproblems:**
   - The recursive solution evaluates the same smaller subproblems repeatedly.
   - *Example:* Computing Fibonacci $F(5) = F(4) + F(3)$, and $F(4) = F(3) + F(2)$ (both need $F(3)$).

---

## 🧭 The 4-Step DP Framework

Whenever you encounter a DP problem, follow this structured thought process:

```
Step 1: Define the State
  └─ What do the indices represent? (e.g., dp[i] = min cost to reach step i)

Step 2: Formulate the Recurrence Relation (Transition Formula)
  └─ How do you reach state `i` from previous states `i-1`, `i-2`, etc.?

Step 3: Establish Base Cases & Boundary Conditions
  └─ What are the starting values? (e.g., dp[0] = 0, dp[1] = 1)

Step 4: Determine Computation Order & Space Optimization
  └─ Do we need a full array/table, or just 1–2 previous variables?
```

---

## ⚔️ Top-Down (Memoization) vs. Bottom-Up (Tabulation)

| Aspect | Top-Down (Memoization) | Bottom-Up (Tabulation) |
| :--- | :--- | :--- |
| **Approach** | Starts at the target and recurses down to base cases. | Starts at base cases and iteratively builds up to the target. |
| **Data Structure** | Recursive call stack + Hash Table / Array cache. | Iterative loops + DP Array / Matrix. |
| **Pros** | Easier to formulate directly from recursive intuition. | Eliminates recursion overhead / call-stack limit; easier space optimization. |
| **Cons** | Call stack overhead ($O(N)$ recursion stack space). | Requires figuring out the exact topological order of subproblems beforehand. |

### Code Comparison: Fibonacci Sequence

#### 1. Top-Down (Memoization)
```python
def fib_memo(n: int, memo={}) -> int:
    if n <= 1:
        return n
    if n not in memo:
        memo[n] = fib_memo(n - 1, memo) + fib_memo(n - 2, memo)
    return memo[n]
```

#### 2. Bottom-Up (Tabulation)
```python
def fib_tab(n: int) -> int:
    if n <= 1:
        return n
    dp = [0] * (n + 1)
    dp[1] = 1
    for i in range(2, n + 1):
        dp[i] = dp[i - 1] + dp[i - 2]
    return dp[n]
```

#### 3. Space-Optimized ($O(1)$ Space)
```python
def fib_optimized(n: int) -> int:
    if n <= 1:
        return n
    prev2, prev1 = 0, 1
    for _ in range(2, n + 1):
        curr = prev1 + prev2
        prev2, prev1 = prev1, curr
    return prev1
```

---

## 🎯 The Core "Take vs. Skip" Decision Model
A huge portion of DP problems boil down to making a binary decision at each element $i$:
- **Option A (Include/Take):** Take element $i$, gain its value, pay its cost, and transition to state $(i-1)$ or $(i-2)$.
- **Option B (Exclude/Skip):** Skip element $i$, gain 0, and transition to state $(i-1)$.

$$\text{dp}[i] = \max(\text{Option A}, \text{Option B})$$

*Example (House Robber):*
$$\text{dp}[i] = \max(\text{dp}[i-1], \text{nums}[i] + \text{dp}[i-2])$$

---

## ⚠️ Common Traps & Best Practices
1. **Base Case Initializations:**
   - Minimization problems: Initialize DP table with $+\infty$ (`float('inf')`), and set base case $\text{dp}[0] = 0$.
   - Maximization problems: Initialize DP table with $-\infty$ or $0$.
   - Counting problems: Base case is typically $\text{dp}[0] = 1$ (1 way to form empty set / sum 0).
2. **Off-by-One Array Indexing:**
   - Usually, creating an array of size `n + 1` allows `dp[i]` to represent a 1-indexed count or exact target value $i$.
3. **Space Optimization Rule of Thumb:**
   - If `dp[i]` only depends on `dp[i-1]` and `dp[i-2]`, you only need 2 variables ($O(1)$ space).
   - If `dp[i][j]` only depends on row `i-1`, you only need two 1D rows ($O(W)$ space).
