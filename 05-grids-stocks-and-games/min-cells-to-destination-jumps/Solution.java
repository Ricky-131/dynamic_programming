import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int minCellsToReach_Recursive(int[][] grid) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int minCellsToReach_Memo(int[][] grid) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int minCellsToReach_Tabulation(int[][] grid) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Direct DP
    public int minCellsToReach_Optimal(int[][] grid) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grid rows (m) and cols (n): ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int m = scanner.nextInt(); int n = scanner.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter grid rows:");
        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) grid[i][j] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.minCellsToReach_Memo(grid));
        System.out.println("Tabulation:      " + sol.minCellsToReach_Tabulation(grid));
        System.out.println("Space-Optimized: " + sol.minCellsToReach_Optimal(grid));
        scanner.close();
    }
}
