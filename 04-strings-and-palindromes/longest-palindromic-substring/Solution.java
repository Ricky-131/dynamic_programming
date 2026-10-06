import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public String longestPalindrome_Recursive(String s) {
        // TODO: Implement recursive approach
        return "";
    }

    // Approach 2: Top-Down DP (Memoization)
    public String longestPalindrome_Memo(String s) {
        // TODO: Implement memoized approach
        return "";
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public String longestPalindrome_Tabulation(String s) {
        // TODO: Implement tabulation approach
        return "";
    }

    // Approach 4: Space-Optimized / Direct DP
    public String longestPalindrome_Optimal(String s) {
        // TODO: Implement optimal approach
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine().trim();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Tabulation:      " + sol.longestPalindrome_Tabulation(s));
        System.out.println("Optimal (Expand):" + sol.longestPalindrome_Optimal(s));
        scanner.close();
    }
}
