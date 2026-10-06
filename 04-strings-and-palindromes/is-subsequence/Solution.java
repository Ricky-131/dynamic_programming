import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public boolean isSubsequence_Recursive(String s, String t) {
        // TODO: Implement recursive approach
        return false;
    }

    // Approach 2: Top-Down DP (Memoization)
    public boolean isSubsequence_Memo(String s, String t) {
        // TODO: Implement memoized approach
        return false;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public boolean isSubsequence_Tabulation(String s, String t) {
        // TODO: Implement tabulation approach
        return false;
    }

    // Approach 4: Space-Optimized / Direct DP
    public boolean isSubsequence_Optimal(String s, String t) {
        // TODO: Implement optimal approach
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter candidate subsequence s: ");
        String s = scanner.nextLine().trim();
        System.out.print("Enter main string t: ");
        String t = scanner.nextLine().trim();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.isSubsequence_Memo(s, t));
        System.out.println("Tabulation:      " + sol.isSubsequence_Tabulation(s, t));
        System.out.println("Optimal (2-Ptr): " + sol.isSubsequence_Optimal(s, t));
        scanner.close();
    }
}
