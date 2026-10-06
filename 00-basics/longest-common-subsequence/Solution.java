import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^(M+N)) Time | O(M+N) Space
    public int lcs_Recursive(String text1, String text2) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(M * N) Time | O(M * N) Space
    public int lcs_Memo(String text1, String text2) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(M * N) Time | O(M * N) Space
    public int lcs_Tabulation(String text1, String text2) {
        // TODO: Implement 2D tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP -> O(M * N) Time | O(min(M, N)) Space
    public int lcs_Optimal(String text1, String text2) {
        // TODO: Implement 2-row space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String text1 = scanner.nextLine().trim();
        System.out.print("Enter second string: ");
        String text2 = scanner.nextLine().trim();

        Solution sol = new Solution();

        System.out.println("\n--- Outputs ---");
        System.out.println("Memoization:     " + sol.lcs_Memo(text1, text2));
        System.out.println("Tabulation:      " + sol.lcs_Tabulation(text1, text2));
        System.out.println("Space-Optimized: " + sol.lcs_Optimal(text1, text2));

        scanner.close();
    }
}
