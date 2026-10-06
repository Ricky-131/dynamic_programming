import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int countSolutions_Recursive(int[] coeff, int rhs) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int countSolutions_Memo(int[] coeff, int rhs) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int countSolutions_Tabulation(int[] coeff, int rhs) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP
    public int countSolutions_Optimal(int[] coeff, int rhs) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of variables: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[] coeff = new int[n];
        System.out.printf("Enter %d coefficients: ", n);
        for (int i = 0; i < n; i++) coeff[i] = scanner.nextInt();
        System.out.print("Enter target RHS value: ");
        int rhs = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.countSolutions_Memo(coeff, rhs));
        System.out.println("Tabulation:      " + sol.countSolutions_Tabulation(coeff, rhs));
        System.out.println("Space-Optimized: " + sol.countSolutions_Optimal(coeff, rhs));
        scanner.close();
    }
}
