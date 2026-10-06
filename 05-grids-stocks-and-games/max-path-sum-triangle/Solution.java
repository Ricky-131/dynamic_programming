import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int minimumTotal_Recursive(int[][] triangle) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int minimumTotal_Memo(int[][] triangle) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int minimumTotal_Tabulation(int[][] triangle) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Direct DP
    public int minimumTotal_Optimal(int[][] triangle) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of triangle rows: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            System.out.printf("Enter %d values for row %d: ", i + 1, i + 1);
            for (int j = 0; j <= i; j++) triangle[i][j] = scanner.nextInt();
        }
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.minimumTotal_Memo(triangle));
        System.out.println("Tabulation:      " + sol.minimumTotal_Tabulation(triangle));
        System.out.println("Space-Optimized: " + sol.minimumTotal_Optimal(triangle));
        scanner.close();
    }
}
