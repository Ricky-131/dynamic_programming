import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int longestPalindromeSubseq_Recursive(String s) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int longestPalindromeSubseq_Memo(String s) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int longestPalindromeSubseq_Tabulation(String s) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Direct DP
    public int longestPalindromeSubseq_Optimal(String s) {
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
        System.out.println("Memoization:     " + sol.longestPalindromeSubseq_Memo(s));
        System.out.println("Tabulation:      " + sol.longestPalindromeSubseq_Tabulation(s));
        System.out.println("Space-Optimized: " + sol.longestPalindromeSubseq_Optimal(s));
        scanner.close();
    }
}
