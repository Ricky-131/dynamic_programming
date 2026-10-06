import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public int minStepsToOne_Recursive(int n) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N) Time | O(N) Space
    public int minStepsToOne_Memo(int n) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N) Time | O(N) Space
    public int minStepsToOne_Tabulation(int n) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP -> O(N) Time | O(1) Space
    public int minStepsToOne_Optimal(int n) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.minStepsToOne_Memo(n));
        System.out.println("Tabulation:      " + sol.minStepsToOne_Tabulation(n));
        System.out.println("Space-Optimized: " + sol.minStepsToOne_Optimal(n));
        scanner.close();
    }
}
