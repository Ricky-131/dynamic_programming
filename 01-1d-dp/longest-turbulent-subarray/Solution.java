import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public int maxTurbulenceSize_Recursive(int[] arr) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N) Time | O(N) Space
    public int maxTurbulenceSize_Memo(int[] arr) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N) Time | O(N) Space
    public int maxTurbulenceSize_Tabulation(int[] arr) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP -> O(N) Time | O(1) Space
    public int maxTurbulenceSize_Optimal(int[] arr) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.printf("Enter %d elements: ", n);
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.maxTurbulenceSize_Memo(arr));
        System.out.println("Tabulation:      " + sol.maxTurbulenceSize_Tabulation(arr));
        System.out.println("Space-Optimized: " + sol.maxTurbulenceSize_Optimal(arr));
        scanner.close();
    }
}
