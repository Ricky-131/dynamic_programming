import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time | O(Amount) Space
    public int coinChange_Recursive(int[] coins, int amount) {
        // TODO: Implement recursive approach
        return -1;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(Coins * Amount) Time | O(Amount) Space
    public int coinChange_Memo(int[] coins, int amount) {
        // TODO: Implement memoized approach
        return -1;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(Coins * Amount) Time | O(Amount) Space
    public int coinChange_Tabulation(int[] coins, int amount) {
        // TODO: Implement tabulation approach
        return -1;
    }

    // Approach 4: Space-Optimized / Cleanest Tabulation -> O(Coins * Amount) Time | O(Amount) Space
    public int coinChange_Optimal(int[] coins, int amount) {
        // TODO: Implement clean 1D array approach
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of coin denominations: ");
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int n = scanner.nextInt();
        int[] coins = new int[n];
        System.out.printf("Enter %d coin values (space separated): ", n);
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        System.out.print("Enter target amount: ");
        int amount = scanner.nextInt();

        Solution sol = new Solution();

        System.out.println("\n--- Outputs ---");
        System.out.println("Memoization:     " + sol.coinChange_Memo(coins, amount));
        System.out.println("Tabulation:      " + sol.coinChange_Tabulation(coins, amount));
        System.out.println("Optimal:         " + sol.coinChange_Optimal(coins, amount));

        scanner.close();
    }
}
