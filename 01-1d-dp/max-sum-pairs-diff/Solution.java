import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public int maxSumPairWithDifferenceLessThanK_Recursive(int[] arr, int k) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N) Time | O(N) Space
    public int maxSumPairWithDifferenceLessThanK_Memo(int[] arr, int k) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N) Time | O(N) Space
    public int maxSumPairWithDifferenceLessThanK_Tabulation(int[] arr, int k) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP -> O(N) Time | O(1) Space
    public int maxSumPairWithDifferenceLessThanK_Optimal(int[] arr, int k) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.printf("Enter %d numbers: ", n);
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.print("Enter difference threshold k: ");
        int k = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.maxSumPairWithDifferenceLessThanK_Memo(arr, k));
        System.out.println("Tabulation:      " + sol.maxSumPairWithDifferenceLessThanK_Tabulation(arr, k));
        System.out.println("Space-Optimized: " + sol.maxSumPairWithDifferenceLessThanK_Optimal(arr, k));
        scanner.close();
    }
}
