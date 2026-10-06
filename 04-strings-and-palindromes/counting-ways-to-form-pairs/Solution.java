import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public long countPairingWays_Recursive(int n) {
        // TODO: Implement recursive approach
        return 0L;
    }

    // Approach 2: Top-Down DP (Memoization)
    public long countPairingWays_Memo(int n) {
        // TODO: Implement memoized approach
        return 0L;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public long countPairingWays_Tabulation(int n) {
        // TODO: Implement tabulation approach
        return 0L;
    }

    // Approach 4: Space-Optimized / Direct DP
    public long countPairingWays_Optimal(int n) {
        // TODO: Implement optimal approach
        return 0L;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of people (n): ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.countPairingWays_Memo(n));
        System.out.println("Tabulation:      " + sol.countPairingWays_Tabulation(n));
        System.out.println("Space-Optimized: " + sol.countPairingWays_Optimal(n));
        scanner.close();
    }
}
