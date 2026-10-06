import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int longestCommonSubstr_Recursive(String S1, String S2, int n, int m) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int longestCommonSubstr_Memo(String S1, String S2, int n, int m) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int longestCommonSubstr_Tabulation(String S1, String S2, int n, int m) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Direct DP
    public int longestCommonSubstr_Optimal(String S1, String S2, int n, int m) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine().trim();
        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine().trim();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.longestCommonSubstr_Memo(s1, s2, s1.length(), s2.length()));
        System.out.println("Tabulation:      " + sol.longestCommonSubstr_Tabulation(s1, s2, s1.length(), s2.length()));
        System.out.println("Space-Optimized: " + sol.longestCommonSubstr_Optimal(s1, s2, s1.length(), s2.length()));
        scanner.close();
    }
}
