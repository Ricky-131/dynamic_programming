import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int[] countBits_Recursive(int n) {
        // TODO: Implement recursive approach
        return new int[0];
    }

    // Approach 2: Top-Down DP (Memoization)
    public int[] countBits_Memo(int n) {
        // TODO: Implement memoized approach
        return new int[0];
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int[] countBits_Tabulation(int n) {
        // TODO: Implement tabulation approach
        return new int[0];
    }

    // Approach 4: Space-Optimized / Binary Search DP
    public int[] countBits_Optimal(int n) {
        // TODO: Implement optimal approach
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Tabulation:      " + java.util.Arrays.toString(sol.countBits_Tabulation(n)));
        System.out.println("Space-Optimized: " + java.util.Arrays.toString(sol.countBits_Optimal(n)));
        scanner.close();
    }
}
