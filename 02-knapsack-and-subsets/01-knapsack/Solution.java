import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int knapSack_Recursive(int W, int[] wt, int[] val, int n) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int knapSack_Memo(int W, int[] wt, int[] val, int n) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int knapSack_Tabulation(int W, int[] wt, int[] val, int n) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP
    public int knapSack_Optimal(int W, int[] wt, int[] val, int n) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] val = new int[n];
        int[] wt = new int[n];
        System.out.printf("Enter %d values: ", n);
        for (int i = 0; i < n; i++) val[i] = scanner.nextInt();
        System.out.printf("Enter %d weights: ", n);
        for (int i = 0; i < n; i++) wt[i] = scanner.nextInt();
        System.out.print("Enter knapsack capacity (W): ");
        int W = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.knapSack_Memo(W, wt, val, n));
        System.out.println("Tabulation:      " + sol.knapSack_Tabulation(W, wt, val, n));
        System.out.println("Space-Optimized: " + sol.knapSack_Optimal(W, wt, val, n));
        scanner.close();
    }
}
