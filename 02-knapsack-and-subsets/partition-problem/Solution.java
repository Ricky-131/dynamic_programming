import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int minDifference_Recursive(int[] arr) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int minDifference_Memo(int[] arr) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int minDifference_Tabulation(int[] arr) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP
    public int minDifference_Optimal(int[] arr) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.printf("Enter %d numbers: ", n);
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.minDifference_Memo(arr));
        System.out.println("Tabulation:      " + sol.minDifference_Tabulation(arr));
        System.out.println("Space-Optimized: " + sol.minDifference_Optimal(arr));
        scanner.close();
    }
}
