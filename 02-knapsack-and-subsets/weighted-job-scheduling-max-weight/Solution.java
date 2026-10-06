import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int maxWeightJobs_Recursive(int[][] jobs) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int maxWeightJobs_Memo(int[][] jobs) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int maxWeightJobs_Tabulation(int[][] jobs) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP
    public int maxWeightJobs_Optimal(int[][] jobs) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of jobs: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[][] jobs = new int[n][3]; // start, end, weight
        System.out.println("Enter start, end, and weight for each job:");
        for (int i = 0; i < n; i++) {
            jobs[i][0] = scanner.nextInt();
            jobs[i][1] = scanner.nextInt();
            jobs[i][2] = scanner.nextInt();
        }
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.maxWeightJobs_Memo(jobs));
        System.out.println("Tabulation:      " + sol.maxWeightJobs_Tabulation(jobs));
        System.out.println("Space-Optimized: " + sol.maxWeightJobs_Optimal(jobs));
        scanner.close();
    }
}
