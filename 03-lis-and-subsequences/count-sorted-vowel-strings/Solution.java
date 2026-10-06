import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int countVowelStrings_Recursive(int n) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int countVowelStrings_Memo(int n) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int countVowelStrings_Tabulation(int n) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Binary Search DP
    public int countVowelStrings_Optimal(int n) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string length n: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.countVowelStrings_Memo(n));
        System.out.println("Tabulation:      " + sol.countVowelStrings_Tabulation(n));
        System.out.println("Space-Optimized: " + sol.countVowelStrings_Optimal(n));
        scanner.close();
    }
}
