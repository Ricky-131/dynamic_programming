import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public boolean isKPal_Recursive(String s, int k) {
        // TODO: Implement recursive approach
        return false;
    }

    // Approach 2: Top-Down DP (Memoization)
    public boolean isKPal_Memo(String s, int k) {
        // TODO: Implement memoized approach
        return false;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public boolean isKPal_Tabulation(String s, int k) {
        // TODO: Implement tabulation approach
        return false;
    }

    // Approach 4: Space-Optimized / Direct DP
    public boolean isKPal_Optimal(String s, int k) {
        // TODO: Implement optimal approach
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine().trim();
        System.out.print("Enter k: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int k = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.isKPal_Memo(s, k));
        System.out.println("Tabulation:      " + sol.isKPal_Tabulation(s, k));
        System.out.println("Space-Optimized: " + sol.isKPal_Optimal(s, k));
        scanner.close();
    }
}
