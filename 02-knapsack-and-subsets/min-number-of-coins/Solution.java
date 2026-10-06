import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int minCoins_Recursive(int[] coins, int V) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int minCoins_Memo(int[] coins, int V) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int minCoins_Tabulation(int[] coins, int V) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP
    public int minCoins_Optimal(int[] coins, int V) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of coins: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] coins = new int[n];
        System.out.printf("Enter %d coin values: ", n);
        for (int i = 0; i < n; i++) coins[i] = scanner.nextInt();
        System.out.print("Enter target value V: ");
        int V = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.minCoins_Memo(coins, V));
        System.out.println("Tabulation:      " + sol.minCoins_Tabulation(coins, V));
        System.out.println("Space-Optimized: " + sol.minCoins_Optimal(coins, V));
        scanner.close();
    }
}
