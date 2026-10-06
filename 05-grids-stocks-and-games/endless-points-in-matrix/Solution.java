import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int countEndless_Recursive(int[][] mat, int n) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int countEndless_Memo(int[][] mat, int n) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int countEndless_Tabulation(int[][] mat, int n) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Direct DP
    public int countEndless_Optimal(int[][] mat, int n) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix size (n): ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter binary matrix rows:");
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) mat[i][j] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.countEndless_Memo(mat, n));
        System.out.println("Tabulation:      " + sol.countEndless_Tabulation(mat, n));
        System.out.println("Space-Optimized: " + sol.countEndless_Optimal(mat, n));
        scanner.close();
    }
}
