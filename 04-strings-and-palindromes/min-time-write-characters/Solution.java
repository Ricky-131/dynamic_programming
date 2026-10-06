import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int minTime_Recursive(int N, int insertTime, int removeTime, int copyTime) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int minTime_Memo(int N, int insertTime, int removeTime, int copyTime) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int minTime_Tabulation(int N, int insertTime, int removeTime, int copyTime) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Direct DP
    public int minTime_Optimal(int N, int insertTime, int removeTime, int copyTime) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter target N: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        System.out.print("Enter insert, remove, copy times: ");
        int ins = scanner.nextInt();
        int rem = scanner.nextInt();
        int copy = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.minTime_Memo(n, ins, rem, copy));
        System.out.println("Tabulation:      " + sol.minTime_Tabulation(n, ins, rem, copy));
        System.out.println("Space-Optimized: " + sol.minTime_Optimal(n, ins, rem, copy));
        scanner.close();
    }
}
