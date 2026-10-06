import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public java.util.List<Integer> largestDivisibleSubset_Recursive(int[] nums) {
        // TODO: Implement recursive approach
        return new java.util.ArrayList<>();
    }

    // Approach 2: Top-Down DP (Memoization)
    public java.util.List<Integer> largestDivisibleSubset_Memo(int[] nums) {
        // TODO: Implement memoized approach
        return new java.util.ArrayList<>();
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public java.util.List<Integer> largestDivisibleSubset_Tabulation(int[] nums) {
        // TODO: Implement tabulation approach
        return new java.util.ArrayList<>();
    }

    // Approach 4: Space-Optimized / Binary Search DP
    public java.util.List<Integer> largestDivisibleSubset_Optimal(int[] nums) {
        // TODO: Implement optimal approach
        return new java.util.ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.printf("Enter %d numbers: ", n);
        for (int i = 0; i < n; i++) nums[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Tabulation:      " + sol.largestDivisibleSubset_Tabulation(nums));
        System.out.println("Optimal:         " + sol.largestDivisibleSubset_Optimal(nums));
        scanner.close();
    }
}
