import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public long bellNumber_Recursive(int n) {
        // TODO: Implement recursive approach
        return 0L;
    }

    // Approach 2: Top-Down DP (Memoization)
    public long bellNumber_Memo(int n) {
        // TODO: Implement memoized approach
        return 0L;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public long bellNumber_Tabulation(int n) {
        // TODO: Implement tabulation approach
        return 0L;
    }

    // Approach 4: Space-Optimized / Direct DP
    public long bellNumber_Optimal(int n) {
        // TODO: Implement optimal approach
        return 0L;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter set size n: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.bellNumber_Memo(n));
        System.out.println("Tabulation:      " + sol.bellNumber_Tabulation(n));
        System.out.println("Space-Optimized: " + sol.bellNumber_Optimal(n));
        scanner.close();
    }
}
