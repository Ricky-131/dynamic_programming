import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int longestStrChain_Recursive(String[] words) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int longestStrChain_Memo(String[] words) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int longestStrChain_Tabulation(String[] words) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Binary Search DP
    public int longestStrChain_Optimal(String[] words) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        String[] words = new String[n];
        System.out.printf("Enter %d words: ", n);
        for (int i = 0; i < n; i++) words[i] = scanner.next();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.longestStrChain_Memo(words));
        System.out.println("Tabulation:      " + sol.longestStrChain_Tabulation(words));
        System.out.println("Space-Optimized: " + sol.longestStrChain_Optimal(words));
        scanner.close();
    }
}
