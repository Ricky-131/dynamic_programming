import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public int maxTaskReward_Recursive(int[] high, int[] low) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N) Time | O(N) Space
    public int maxTaskReward_Memo(int[] high, int[] low) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N) Time | O(N) Space
    public int maxTaskReward_Tabulation(int[] high, int[] low) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP -> O(N) Time | O(1) Space
    public int maxTaskReward_Optimal(int[] high, int[] low) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] high = new int[n];
        int[] low = new int[n];
        System.out.printf("Enter %d high effort values: ", n);
        for (int i = 0; i < n; i++) high[i] = scanner.nextInt();
        System.out.printf("Enter %d low effort values: ", n);
        for (int i = 0; i < n; i++) low[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.maxTaskReward_Memo(high, low));
        System.out.println("Tabulation:      " + sol.maxTaskReward_Tabulation(high, low));
        System.out.println("Space-Optimized: " + sol.maxTaskReward_Optimal(high, low));
        scanner.close();
    }
}
