import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public boolean canPartition_Recursive(int[] nums) {
        // TODO: Implement recursive approach
        return false;
    }

    // Approach 2: Top-Down DP (Memoization)
    public boolean canPartition_Memo(int[] nums) {
        // TODO: Implement memoized approach
        return false;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public boolean canPartition_Tabulation(int[] nums) {
        // TODO: Implement tabulation approach
        return false;
    }

    // Approach 4: Space-Optimized DP
    public boolean canPartition_Optimal(int[] nums) {
        // TODO: Implement space-optimized approach
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.printf("Enter %d numbers: ", n);
        for (int i = 0; i < n; i++) nums[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.canPartition_Memo(nums));
        System.out.println("Tabulation:      " + sol.canPartition_Tabulation(nums));
        System.out.println("Space-Optimized: " + sol.canPartition_Optimal(nums));
        scanner.close();
    }
}
