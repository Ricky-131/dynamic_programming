import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public long sumSubstrings_Recursive(String s) {
        // TODO: Implement recursive approach
        return 0L;
    }

    // Approach 2: Top-Down DP (Memoization)
    public long sumSubstrings_Memo(String s) {
        // TODO: Implement memoized approach
        return 0L;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public long sumSubstrings_Tabulation(String s) {
        // TODO: Implement tabulation approach
        return 0L;
    }

    // Approach 4: Space-Optimized / Binary Search DP
    public long sumSubstrings_Optimal(String s) {
        // TODO: Implement optimal approach
        return 0L;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numeric string: ");
        String s = scanner.nextLine().trim();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.sumSubstrings_Memo(s));
        System.out.println("Tabulation:      " + sol.sumSubstrings_Tabulation(s));
        System.out.println("Space-Optimized: " + sol.sumSubstrings_Optimal(s));
        scanner.close();
    }
}
