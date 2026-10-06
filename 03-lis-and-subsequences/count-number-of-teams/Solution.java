import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int numTeams_Recursive(int[] rating) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int numTeams_Memo(int[] rating) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int numTeams_Tabulation(int[] rating) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Binary Search DP
    public int numTeams_Optimal(int[] rating) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of soldiers: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] rating = new int[n];
        System.out.printf("Enter %d soldier ratings: ", n);
        for (int i = 0; i < n; i++) rating[i] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.numTeams_Memo(rating));
        System.out.println("Tabulation:      " + sol.numTeams_Tabulation(rating));
        System.out.println("Space-Optimized: " + sol.numTeams_Optimal(rating));
        scanner.close();
    }
}
