import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int solveWordWrap_Recursive(int[] nums, int k) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int solveWordWrap_Memo(int[] nums, int k) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int solveWordWrap_Tabulation(int[] nums, int k) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Direct DP
    public int solveWordWrap_Optimal(int[] nums, int k) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.printf("Enter %d word lengths: ", n);
        for (int i = 0; i < n; i++) nums[i] = scanner.nextInt();
        System.out.print("Enter line width limit (k): ");
        int k = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.solveWordWrap_Memo(nums, k));
        System.out.println("Tabulation:      " + sol.solveWordWrap_Tabulation(nums, k));
        System.out.println("Space-Optimized: " + sol.solveWordWrap_Optimal(nums, k));
        scanner.close();
    }
}
