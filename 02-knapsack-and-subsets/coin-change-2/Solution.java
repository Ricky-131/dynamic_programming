import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int change_Recursive(int amount, int[] coins) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int change_Memo(int amount, int[] coins) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int change_Tabulation(int amount, int[] coins) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP
    public int change_Optimal(int amount, int[] coins) {
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
        System.out.print("Enter target amount: ");
        int amount = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.change_Memo(amount, coins));
        System.out.println("Tabulation:      " + sol.change_Tabulation(amount, coins));
        System.out.println("Space-Optimized: " + sol.change_Optimal(amount, coins));
        scanner.close();
    }
}
