import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int nthUglyNumber_Recursive(int n) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int nthUglyNumber_Memo(int n) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int nthUglyNumber_Tabulation(int n) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP
    public int nthUglyNumber_Optimal(int n) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.nthUglyNumber_Memo(n));
        System.out.println("Tabulation:      " + sol.nthUglyNumber_Tabulation(n));
        System.out.println("Space-Optimized: " + sol.nthUglyNumber_Optimal(n));
        scanner.close();
    }
}
