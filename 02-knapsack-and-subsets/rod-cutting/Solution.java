import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int cutRod_Recursive(int[] price, int n) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int cutRod_Memo(int[] price, int n) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int cutRod_Tabulation(int[] price, int n) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP
    public int cutRod_Optimal(int[] price, int n) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rod length (n): ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] price = new int[n];
        System.out.printf("Enter prices for lengths 1 to %d: ", n);
        for (int i = 0; i < n; i++) price[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.cutRod_Memo(price, n));
        System.out.println("Tabulation:      " + sol.cutRod_Tabulation(price, n));
        System.out.println("Space-Optimized: " + sol.cutRod_Optimal(price, n));
        scanner.close();
    }
}
