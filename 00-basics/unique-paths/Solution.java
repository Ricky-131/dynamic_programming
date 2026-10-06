import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^(M+N)) Time | O(M+N) Space
    public int uniquePaths_Recursive(int m, int n) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(M * N) Time | O(M * N) Space
    public int uniquePaths_Memo(int m, int n) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(M * N) Time | O(M * N) Space
    public int uniquePaths_Tabulation(int m, int n) {
        // TODO: Implement 2D tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP -> O(M * N) Time | O(N) Space
    public int uniquePaths_Optimal(int m, int n) {
        // TODO: Implement 1D array space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows (m): ");
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int m = scanner.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();

        Solution sol = new Solution();

        System.out.println("\n--- Outputs ---");
        System.out.println("Memoization:     " + sol.uniquePaths_Memo(m, n));
        System.out.println("Tabulation:      " + sol.uniquePaths_Tabulation(m, n));
        System.out.println("Space-Optimized: " + sol.uniquePaths_Optimal(m, n));

        scanner.close();
    }
}
