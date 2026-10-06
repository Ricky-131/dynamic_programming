import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int findLongestChain_Recursive(int[][] pairs) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int findLongestChain_Memo(int[][] pairs) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int findLongestChain_Tabulation(int[][] pairs) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Binary Search DP
    public int findLongestChain_Optimal(int[][] pairs) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of pairs: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[][] pairs = new int[n][2];
        System.out.println("Enter pairs (first, second):");
        for (int i = 0; i < n; i++) {
            pairs[i][0] = scanner.nextInt();
            pairs[i][1] = scanner.nextInt();
        }
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.findLongestChain_Memo(pairs));
        System.out.println("Tabulation:      " + sol.findLongestChain_Tabulation(pairs));
        System.out.println("Space-Optimized: " + sol.findLongestChain_Optimal(pairs));
        scanner.close();
    }
}
