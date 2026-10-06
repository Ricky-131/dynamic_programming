import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public long totalWays_Recursive(int n) {
        // TODO: Implement recursive approach
        return 0L;
    }

    // Approach 2: Top-Down DP (Memoization)
    public long totalWays_Memo(int n) {
        // TODO: Implement memoized approach
        return 0L;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public long totalWays_Tabulation(int n) {
        // TODO: Implement tabulation approach
        return 0L;
    }

    // Approach 4: Space-Optimized DP
    public long totalWays_Optimal(int n) {
        // TODO: Implement space-optimized approach
        return 0L;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of road (n): ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.totalWays_Memo(n));
        System.out.println("Tabulation:      " + sol.totalWays_Tabulation(n));
        System.out.println("Space-Optimized: " + sol.totalWays_Optimal(n));
        scanner.close();
    }
}
