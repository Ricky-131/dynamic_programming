import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public int numDecodings_Recursive(String s) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N) Time | O(N) Space
    public int numDecodings_Memo(String s) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N) Time | O(N) Space
    public int numDecodings_Tabulation(String s) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP -> O(N) Time | O(1) Space
    public int numDecodings_Optimal(String s) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter encoded digit string: ");
        String s = scanner.nextLine().trim();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.numDecodings_Memo(s));
        System.out.println("Tabulation:      " + sol.numDecodings_Tabulation(s));
        System.out.println("Space-Optimized: " + sol.numDecodings_Optimal(s));
        scanner.close();
    }
}
