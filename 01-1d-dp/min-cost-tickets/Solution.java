import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public int mincostTickets_Recursive(int[] days, int[] costs) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N) Time | O(N) Space
    public int mincostTickets_Memo(int[] days, int[] costs) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N) Time | O(N) Space
    public int mincostTickets_Tabulation(int[] days, int[] costs) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP -> O(N) Time | O(1) Space
    public int mincostTickets_Optimal(int[] days, int[] costs) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of travel days: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] days = new int[n];
        System.out.printf("Enter %d travel days: ", n);
        for (int i = 0; i < n; i++) days[i] = scanner.nextInt();
        int[] costs = new int[3];
        System.out.print("Enter 3 ticket costs (1-day, 7-day, 30-day): ");
        for (int i = 0; i < 3; i++) costs[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.mincostTickets_Memo(days, costs));
        System.out.println("Tabulation:      " + sol.mincostTickets_Tabulation(days, costs));
        System.out.println("Space-Optimized: " + sol.mincostTickets_Optimal(days, costs));
        scanner.close();
    }
}
