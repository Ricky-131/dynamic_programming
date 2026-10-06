import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public java.util.List<java.util.List<Integer>> generate_Recursive(int numRows) {
        // TODO: Implement recursive approach
        return new java.util.ArrayList<>();
    }

    // Approach 2: Top-Down DP (Memoization)
    public java.util.List<java.util.List<Integer>> generate_Memo(int numRows) {
        // TODO: Implement memoized approach
        return new java.util.ArrayList<>();
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public java.util.List<java.util.List<Integer>> generate_Tabulation(int numRows) {
        // TODO: Implement tabulation approach
        return new java.util.ArrayList<>();
    }

    // Approach 4: Space-Optimized / Direct DP
    public java.util.List<java.util.List<Integer>> generate_Optimal(int numRows) {
        // TODO: Implement optimal approach
        return new java.util.ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numRows: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int numRows = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Pascal's Triangle: " + sol.generate_Tabulation(numRows));
        scanner.close();
    }
}
