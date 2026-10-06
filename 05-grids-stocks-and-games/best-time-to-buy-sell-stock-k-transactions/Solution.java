import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int maxProfit_Recursive(int k, int[] prices) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int maxProfit_Memo(int k, int[] prices) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int maxProfit_Tabulation(int k, int[] prices) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Direct DP
    public int maxProfit_Optimal(int k, int[] prices) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter max transactions (k): ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int k = scanner.nextInt();
        System.out.print("Enter number of days: ");
        int n = scanner.nextInt();
        int[] prices = new int[n];
        System.out.printf("Enter %d stock prices: ", n);
        for (int i = 0; i < n; i++) prices[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.maxProfit_Memo(k, prices));
        System.out.println("Tabulation:      " + sol.maxProfit_Tabulation(k, prices));
        System.out.println("Space-Optimized: " + sol.maxProfit_Optimal(k, prices));
        scanner.close();
    }
}
