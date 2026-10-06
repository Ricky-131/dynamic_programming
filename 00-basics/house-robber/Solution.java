import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public int rob_Recursive(int[] nums) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N) Time | O(N) Space
    public int rob_Memo(int[] nums) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N) Time | O(N) Space
    public int rob_Tabulation(int[] nums) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP -> O(N) Time | O(1) Space
    public int rob_Optimal(int[] nums) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of houses: ");
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.printf("Enter %d house values (space separated): ", n);
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new Solution();

        System.out.println("\n--- Outputs ---");
        System.out.println("Memoization:     " + sol.rob_Memo(nums));
        System.out.println("Tabulation:      " + sol.rob_Tabulation(nums));
        System.out.println("Space-Optimized: " + sol.rob_Optimal(nums));

        scanner.close();
    }
}
