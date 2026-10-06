import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public double maxAverageValueOfPath_Recursive(int[][] grid, int N) {
        // TODO: Implement recursive approach
        return 0.0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public double maxAverageValueOfPath_Memo(int[][] grid, int N) {
        // TODO: Implement memoized approach
        return 0.0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public double maxAverageValueOfPath_Tabulation(int[][] grid, int N) {
        // TODO: Implement tabulation approach
        return 0.0;
    }

    // Approach 4: Space-Optimized / Direct DP
    public double maxAverageValueOfPath_Optimal(int[][] grid, int N) {
        // TODO: Implement optimal approach
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grid dimension N: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];
        System.out.println("Enter matrix rows:");
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) grid[i][j] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.printf("Memoization:     %.3f\n", sol.maxAverageValueOfPath_Memo(grid, n));
        System.out.printf("Tabulation:      %.3f\n", sol.maxAverageValueOfPath_Tabulation(grid, n));
        System.out.printf("Space-Optimized: %.3f\n", sol.maxAverageValueOfPath_Optimal(grid, n));
        scanner.close();
    }
}
