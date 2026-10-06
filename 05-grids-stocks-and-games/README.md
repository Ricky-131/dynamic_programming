# 05. 2D Grids, Interval DP, Stocks & Game Theory

## 📖 Overview
This track brings together four advanced Dynamic Programming paradigms:
1. **2D Grid & Matrix DP** (Navigating coordinate systems)
2. **Interval / Partition DP (MCM)** (Optimal range parenthesization $[i \dots j]$)
3. **State Machine DP on Stocks** (Multi-state trading decisions)
4. **Game Theory / Minimax DP** (Optimal two-player zero-sum games)

---

## 🗺️ 1. 2D Grid & Matrix DP

### Concept & Transition
- At cell $(r, c)$, moving only **Right** and **Down**:
  $$\text{dp}[r][c] = \text{grid}[r][c] + \min(\text{dp}[r-1][c], \, \text{dp}[r][c-1])$$
- **Space Optimization:** A 2D $M × N$ matrix can almost always be optimized to a **1D array of size $N$** because state $(r, c)$ only depends on the current row and the row directly above it.

```python
# Min Path Sum (O(N) Space)
def min_path_sum(grid: list[list[int]]) -> int:
    m, n = len(grid), len(grid[0])
    dp = [float('inf')] * n
    dp[0] = 0
    
    for r in range(m):
        dp[0] += grid[r][0]
        for c in range(1, n):
            dp[c] = grid[r][c] + min(dp[c], dp[c - 1])
            
    return dp[-1]
```

---

## 📦 2. Interval DP / Matrix Chain Multiplication (MCM)

### Framework: Range Length Expansion
- **State:** `dp[i][j]` = optimal cost/value for the sub-range $[i \dots j]$.
- **Evaluation Order:** Loop over range length $L = 2 \dots N$, then starting point $i$, and test all split points $k \in [i, j-1]$:
  $$\text{dp}[i][j] = \min_{i \le k < j} (\text{dp}[i][k] + \text{dp}[k+1][j] + \text{cost}(i, k, j))$$

```python
# Matrix Chain Multiplication Template
def matrix_chain_order(dims: list[int]) -> int:
    n = len(dims) - 1
    dp = [[0] * (n + 1) for _ in range(n + 1)]
    
    for length in range(2, n + 1):  # Range length
        for i in range(1, n - length + 2):
            j = i + length - 1
            dp[i][j] = float('inf')
            for k in range(i, j):
                cost = dp[i][k] + dp[k + 1][j] + dims[i - 1] * dims[k] * dims[j]
                dp[i][j] = min(dp[i][j], cost)
                
    return dp[1][n]
```

---

## 📈 3. DP on Stocks (State Machine Framework)

Instead of complex index math, model stock problems as a **Finite State Machine** with states at the end of each day:

```
        ┌────────── Buy ──────────┐
        ▼                         │
   [ Hold Stock ] ─────────► [ Cash / Sold ]
   (hold = max(hold, cash - price))  (cash = max(cash, hold + price))
```

### General Stock Template (At Most $K$ Transactions):
```python
def max_profit_k(k: int, prices: list[int]) -> int:
    if not prices or k == 0:
        return 0
    if k >= len(prices) // 2:
        # Unlimited transactions (Greedy)
        return sum(max(0, prices[i] - prices[i - 1]) for i in range(1, len(prices)))
        
    hold = [-float('inf')] * (k + 1)
    cash = [0] * (k + 1)
    
    for p in prices:
        for t in range(1, k + 1):
            hold[t] = max(hold[t], cash[t - 1] - p)
            cash[t] = max(cash[t], hold[t] + p)
            
    return cash[k]
```

---

## 🎲 4. Game Theory / Minimax DP

### Core Axiom: Optimal Opponent
- In a two-player turn-based game, your score from range $[i \dots j]$ is your current choice **minus** the opponent's best possible score from the remaining state:
  $$\text{dp}[i][j] = \max(\text{nums}[i] - \text{dp}[i+1][j], \; \text{nums}[j] - \text{dp}[i][j-1])$$
- Player 1 wins if the relative score $\text{dp}[0][N-1] \ge 0$.

```python
# Stone Game / Predict the Winner (O(N) Space)
def stone_game(piles: list[int]) -> bool:
    n = len(piles)
    dp = piles[:]
    for length in range(2, n + 1):
        for i in range(n - length + 1):
            j = i + length - 1
            dp[i] = max(piles[i] - dp[i + 1], piles[j] - dp[i])
    return dp[0] >= 0
```
