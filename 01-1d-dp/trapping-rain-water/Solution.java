import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public int trap_Recursive(int[] height) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N) Time | O(N) Space
    public int trap_Memo(int[] height) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N) Time | O(N) Space
    public int trap_Tabulation(int[] height) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP -> O(N) Time | O(1) Space
    public int trap_Optimal(int[] height) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of bars: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] height = new int[n];
        System.out.printf("Enter %d elevation heights: ", n);
        for (int i = 0; i < n; i++) height[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.trap_Memo(height));
        System.out.println("Tabulation:      " + sol.trap_Tabulation(height));
        System.out.println("Space-Optimized: " + sol.trap_Optimal(height));
        scanner.close();
    }
}
