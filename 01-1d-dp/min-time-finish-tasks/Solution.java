import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public int minTimeToFinish_Recursive(int[] tasks) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N) Time | O(N) Space
    public int minTimeToFinish_Memo(int[] tasks) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N) Time | O(N) Space
    public int minTimeToFinish_Tabulation(int[] tasks) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP -> O(N) Time | O(1) Space
    public int minTimeToFinish_Optimal(int[] tasks) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of tasks: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] tasks = new int[n];
        System.out.printf("Enter %d task times: ", n);
        for (int i = 0; i < n; i++) tasks[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.minTimeToFinish_Memo(tasks));
        System.out.println("Tabulation:      " + sol.minTimeToFinish_Tabulation(tasks));
        System.out.println("Space-Optimized: " + sol.minTimeToFinish_Optimal(tasks));
        scanner.close();
    }
}
