import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int totalOfferings_Recursive(int[] heights) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int totalOfferings_Memo(int[] heights) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int totalOfferings_Tabulation(int[] heights) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP
    public int totalOfferings_Optimal(int[] heights) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of temples: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] heights = new int[n];
        System.out.printf("Enter %d temple heights: ", n);
        for (int i = 0; i < n; i++) heights[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.totalOfferings_Memo(heights));
        System.out.println("Tabulation:      " + sol.totalOfferings_Tabulation(heights));
        System.out.println("Space-Optimized: " + sol.totalOfferings_Optimal(heights));
        scanner.close();
    }
}
