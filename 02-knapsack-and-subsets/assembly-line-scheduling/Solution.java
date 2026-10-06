import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int carAssembly_Recursive(int[][] a, int[][] t, int[] e, int[] x) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int carAssembly_Memo(int[][] a, int[][] t, int[] e, int[] x) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int carAssembly_Tabulation(int[][] a, int[][] t, int[] e, int[] x) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP
    public int carAssembly_Optimal(int[][] a, int[][] t, int[] e, int[] x) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of stations per line: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[][] a = new int[2][n];
        System.out.println("Enter station times for Line 1:");
        for (int i = 0; i < n; i++) a[0][i] = scanner.nextInt();
        System.out.println("Enter station times for Line 2:");
        for (int i = 0; i < n; i++) a[1][i] = scanner.nextInt();
        int[][] t = new int[2][n];
        System.out.println("Enter transition times from Line 1 to 2:");
        for (int i = 0; i < n - 1; i++) t[0][i] = scanner.nextInt();
        System.out.println("Enter transition times from Line 2 to 1:");
        for (int i = 0; i < n - 1; i++) t[1][i] = scanner.nextInt();
        int[] e = new int[2]; int[] x = new int[2];
        System.out.print("Enter entry times (e1, e2): ");
        e[0] = scanner.nextInt(); e[1] = scanner.nextInt();
        System.out.print("Enter exit times (x1, x2): ");
        x[0] = scanner.nextInt(); x[1] = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.carAssembly_Memo(a, t, e, x));
        System.out.println("Tabulation:      " + sol.carAssembly_Tabulation(a, t, e, x));
        System.out.println("Space-Optimized: " + sol.carAssembly_Optimal(a, t, e, x));
        scanner.close();
    }
}
