import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public boolean subsetSum_Recursive(int[] nums, int target) {
        // TODO: Implement recursive approach
        return false;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N * Target) Time | O(N * Target) Space
    public boolean subsetSum_Memo(int[] nums, int target) {
        // TODO: Implement memoized approach
        return false;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N * Target) Time | O(N * Target) Space
    public boolean subsetSum_Tabulation(int[] nums, int target) {
        // TODO: Implement 2D tabulation approach
        return false;
    }

    // Approach 4: Space-Optimized DP -> O(N * Target) Time | O(Target) Space
    public boolean subsetSum_Optimal(int[] nums, int target) {
        // TODO: Implement 1D array space-optimized approach
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.printf("Enter %d numbers (space separated): ", n);
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        Solution sol = new Solution();

        System.out.println("\n--- Outputs ---");
        System.out.println("Memoization:     " + sol.subsetSum_Memo(nums, target));
        System.out.println("Tabulation:      " + sol.subsetSum_Tabulation(nums, target));
        System.out.println("Space-Optimized: " + sol.subsetSum_Optimal(nums, target));

        scanner.close();
    }
}
