import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public int minCostClimbingStairs_Recursive(int[] cost) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N) Time | O(N) Space
    public int minCostClimbingStairs_Memo(int[] cost) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N) Time | O(N) Space
    public int minCostClimbingStairs_Tabulation(int[] cost) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP -> O(N) Time | O(1) Space
    public int minCostClimbingStairs_Optimal(int[] cost) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of steps: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] cost = new int[n];
        System.out.printf("Enter %d step costs: ", n);
        for (int i = 0; i < n; i++) cost[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.minCostClimbingStairs_Memo(cost));
        System.out.println("Tabulation:      " + sol.minCostClimbingStairs_Tabulation(cost));
        System.out.println("Space-Optimized: " + sol.minCostClimbingStairs_Optimal(cost));
        scanner.close();
    }
}
