import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int longestRepeatingSubsequence_Recursive(String str) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int longestRepeatingSubsequence_Memo(String str) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int longestRepeatingSubsequence_Tabulation(String str) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Direct DP
    public int longestRepeatingSubsequence_Optimal(String str) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine().trim();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.longestRepeatingSubsequence_Memo(s));
        System.out.println("Tabulation:      " + sol.longestRepeatingSubsequence_Tabulation(s));
        System.out.println("Space-Optimized: " + sol.longestRepeatingSubsequence_Optimal(s));
        scanner.close();
    }
}
