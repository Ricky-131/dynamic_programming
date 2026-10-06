import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int maxPathSumRightTriangle_Recursive(int[][] tri, int n) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int maxPathSumRightTriangle_Memo(int[][] tri, int n) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int maxPathSumRightTriangle_Tabulation(int[][] tri, int n) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Direct DP
    public int maxPathSumRightTriangle_Optimal(int[][] tri, int n) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows (n): ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[][] tri = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter %d values for row %d: ", i + 1, i + 1);
            for (int j = 0; j <= i; j++) tri[i][j] = scanner.nextInt();
        }
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.maxPathSumRightTriangle_Memo(tri, n));
        System.out.println("Tabulation:      " + sol.maxPathSumRightTriangle_Tabulation(tri, n));
        System.out.println("Space-Optimized: " + sol.maxPathSumRightTriangle_Optimal(tri, n));
        scanner.close();
    }
}
