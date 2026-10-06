import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public boolean canCross_Recursive(int[] stones) {
        // TODO: Implement recursive approach
        return false;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N) Time | O(N) Space
    public boolean canCross_Memo(int[] stones) {
        // TODO: Implement memoized approach
        return false;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N) Time | O(N) Space
    public boolean canCross_Tabulation(int[] stones) {
        // TODO: Implement tabulation approach
        return false;
    }

    // Approach 4: Space-Optimized DP -> O(N) Time | O(1) Space
    public boolean canCross_Optimal(int[] stones) {
        // TODO: Implement space-optimized approach
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of stones: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] stones = new int[n];
        System.out.printf("Enter %d stone positions: ", n);
        for (int i = 0; i < n; i++) stones[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.canCross_Memo(stones));
        System.out.println("Tabulation:      " + sol.canCross_Tabulation(stones));
        System.out.println("Space-Optimized: " + sol.canCross_Optimal(stones));
        scanner.close();
    }
}
