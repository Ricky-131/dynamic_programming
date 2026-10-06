import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int matrixMultiplication_Recursive(int[] p, int n) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int matrixMultiplication_Memo(int[] p, int n) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int matrixMultiplication_Tabulation(int[] p, int n) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Direct DP
    public int matrixMultiplication_Optimal(int[] p, int n) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of dimensions (N): ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] p = new int[n];
        System.out.printf("Enter %d dimension values: ", n);
        for (int i = 0; i < n; i++) p[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.matrixMultiplication_Memo(p, n));
        System.out.println("Tabulation (MCM):" + sol.matrixMultiplication_Tabulation(p, n));
        System.out.println("Optimal:         " + sol.matrixMultiplication_Optimal(p, n));
        scanner.close();
    }
}
