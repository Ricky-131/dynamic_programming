# Dynamic Programming Mastery Roadmap 🚀

A comprehensive, structured curriculum of **100 curated Dynamic Programming (DP) problems** categorized by patterns, paired with in-depth study guides, clean Java solution templates, and analytical cheatsheets.

---

## 🧭 The 2-Phase Study Framework

```
 ┌─────────────────────────────────────────────────────────────┐
 │  PHASE 1: Foundation Bootcamp (Core Gateway Patterns)       │
 │   8 Gateway Problems to master Memoization, Tabulation, &   │
 │   $O(1)$ Space Optimization before diving into tracks.      │
 └──────────────────────────────┬──────────────────────────────┘
                                │
                                ▼
 ┌─────────────────────────────────────────────────────────────┐
 │  PHASE 2: Specialized Topic Tracks                          │
 │   5 Dedicated Tracks covering standard interview patterns   │
 │   from 1D Stepping to 2D Grids, Strings, and Game Theory.   │
 └─────────────────────────────────────────────────────────────┘
```

---

## 📚 Curriculum & Topic Modules

| Module | Focus Area | Problems | Study Guide |
| :--- | :--- | :---: | :---: |
| **`00-basics`** | Core Principles, Memoization, Tabulation, Take/Skip Choice | **8** | [📖 Read Guide](00-basics/README.md) |
| **`01-1d-dp`** | 1D Stepping, Kadane Subarray DP, Partitioning & State Machines | **20** | [📖 Read Guide](01-1d-dp/README.md) |
| **`02-knapsack-and-subsets`** | 0/1 Knapsack, Unbounded Knapsack, Subset Sums & Partitions | **20** | [📖 Read Guide](02-knapsack-and-subsets/README.md) |
| **`03-lis-and-subsequences`** | LIS, $O(N \log N)$ Patience Sorting, Bitonic & Chaining Patterns | **18** | [📖 Read Guide](03-lis-and-subsequences/README.md) |
| **`04-strings-and-palindromes`** | LCS, Edit Distance, Palindromic Substrings & Subsequences | **17** | [📖 Read Guide](04-strings-and-palindromes/README.md) |
| **`05-grids-stocks-and-games`** | 2D Coordinate DP, Interval (MCM), State Machine Stocks & Minimax | **16** | [📖 Read Guide](05-grids-stocks-and-games/README.md) |
| **Total** | | **99** | |

---

## 📂 Problem Package Architecture

Every problem directory is organized as an independent study package containing two complementary files:

```text
📁 problem-name/
   ├── Solution.java        <-- Runnable Java class with progressive optimization methods
   └── EXPLANATION.md       <-- Analytical cheatsheet with formulas and complexity matrix
```

### 1. `Solution.java` (The Evolution Workflow)
Rather than a single flat solution, each Java file is structured to illustrate the natural optimization path:
- `_Recursive(...)` $\rightarrow$ Brute-force recursive exploration ($O(2^N)$).
- `_Memo(...)` $\rightarrow$ Top-down caching with recursion stack ($O(N)$).
- `_Tabulation(...)` $\rightarrow$ Bottom-up iterative table construction ($O(N)$).
- `_Optimal(...)` $\rightarrow$ Space-optimized variables / 1D array ($O(1)$ space).
- `main(String[] args)` $\rightarrow$ Interactive input reading via `Scanner(System.in)`.

### 2. `EXPLANATION.md` (The Interview Cheatsheet)
A quick-reference summary containing:
- Direct problem links (LeetCode / GeeksforGeeks).
- **Core Intuition** (plain-English breakdown of the subproblem structure).
- **Recurrence Relation** (formal state definition, base cases, and transition equation).
- **Complexity Matrix** (Time vs. Space tradeoffs for all approaches).
- **Edge Cases & Pitfalls** (off-by-one errors, 0-bounds, and boundary traps).

---

## ⚡ The 4-Step DP Problem Solving Formula

Whenever approaching a new Dynamic Programming challenge:

1. **Define the State in Plain Words:**
   What does `dp[i]` or `dp[i][j]` represent? *(e.g., "The minimum cost to reach step $i$" or "Length of LCS in prefix $S_1[0 \dots i-1]$ and $S_2[0 \dots j-1]$")*.
2. **Formulate the Recurrence Transition:**
   Express the current state strictly as a mathematical function of previously computed subproblems.
3. **Identify Base Cases & Boundaries:**
   What are the smallest trivially solvable states? Initializing $\infty$, $-\infty$, $0$, or $1$ correctly determines correctness.
4. **Determine Traversal Order & Space Optimization:**
   If `dp[i]` only depends on `dp[i-1]` and `dp[i-2]`, reduce the space from $O(N) \to O(1)$. If `dp[i][w]` in 0/1 Knapsack depends on the previous row, iterate $w$ backwards ($W \to w_i$) to use a 1D array.

---

## 🛠️ Getting Started

### Clone the Repository
```bash
git clone https://github.com/Ricky-131/dynamic_programming.git
cd dynamic_programming
```

### Compile & Run Any Problem
```bash
# Example: Running Climbing Stairs
cd 00-basics/climbing-stairs
javac Solution.java
java Solution
```
