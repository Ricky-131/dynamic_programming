import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public int lengthOfLIS_Recursive(int[] nums) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N^2) Time | O(N^2) Space
    public int lengthOfLIS_Memo(int[] nums) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N^2) Time | O(N) Space
    public int lengthOfLIS_Tabulation(int[] nums) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Binary Search / Patience Sorting -> O(N log N) Time | O(N) Space
    public int lengthOfLIS_BinarySearch(int[] nums) {
        // TODO: Implement binary search (bisect) approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.printf("Enter %d numbers (space separated): ", n);
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution sol = new Solution();

        System.out.println("\n--- Outputs ---");
        System.out.println("Memoization:     " + sol.lengthOfLIS_Memo(nums));
        System.out.println("Tabulation:      " + sol.lengthOfLIS_Tabulation(nums));
        System.out.println("Binary Search:   " + sol.lengthOfLIS_BinarySearch(nums));

        scanner.close();
    }
}
