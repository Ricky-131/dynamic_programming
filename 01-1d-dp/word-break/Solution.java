import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public boolean wordBreak_Recursive(String s, java.util.List<String> wordDict) {
        // TODO: Implement recursive approach
        return false;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N) Time | O(N) Space
    public boolean wordBreak_Memo(String s, java.util.List<String> wordDict) {
        // TODO: Implement memoized approach
        return false;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N) Time | O(N) Space
    public boolean wordBreak_Tabulation(String s, java.util.List<String> wordDict) {
        // TODO: Implement tabulation approach
        return false;
    }

    // Approach 4: Space-Optimized DP -> O(N) Time | O(1) Space
    public boolean wordBreak_Optimal(String s, java.util.List<String> wordDict) {
        // TODO: Implement space-optimized approach
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string s: ");
        String s = scanner.nextLine().trim();
        System.out.print("Enter number of dictionary words: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        java.util.List<String> dict = new java.util.ArrayList<>();
        System.out.printf("Enter %d words: ", n);
        for (int i = 0; i < n; i++) dict.add(scanner.next());
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.wordBreak_Memo(s, dict));
        System.out.println("Tabulation:      " + sol.wordBreak_Tabulation(s, dict));
        System.out.println("Space-Optimized: " + sol.wordBreak_Optimal(s, dict));
        scanner.close();
    }
}
