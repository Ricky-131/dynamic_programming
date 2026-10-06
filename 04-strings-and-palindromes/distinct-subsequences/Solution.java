import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int numDistinct_Recursive(String s, String t) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int numDistinct_Memo(String s, String t) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int numDistinct_Tabulation(String s, String t) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Direct DP
    public int numDistinct_Optimal(String s, String t) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string s: ");
        String s = scanner.nextLine().trim();
        System.out.print("Enter target subsequence t: ");
        String t = scanner.nextLine().trim();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.numDistinct_Memo(s, t));
        System.out.println("Tabulation:      " + sol.numDistinct_Tabulation(s, t));
        System.out.println("Space-Optimized: " + sol.numDistinct_Optimal(s, t));
        scanner.close();
    }
}
