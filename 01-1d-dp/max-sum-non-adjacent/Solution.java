import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public int findMaxSum_Recursive(int[] nums) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N) Time | O(N) Space
    public int findMaxSum_Memo(int[] nums) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N) Time | O(N) Space
    public int findMaxSum_Tabulation(int[] nums) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP -> O(N) Time | O(1) Space
    public int findMaxSum_Optimal(int[] nums) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.printf("Enter %d numbers: ", n);
        for (int i = 0; i < n; i++) nums[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.findMaxSum_Memo(nums));
        System.out.println("Tabulation:      " + sol.findMaxSum_Tabulation(nums));
        System.out.println("Space-Optimized: " + sol.findMaxSum_Optimal(nums));
        scanner.close();
    }
}
