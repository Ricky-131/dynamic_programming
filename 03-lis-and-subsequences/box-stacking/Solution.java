import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> Exponential Time
    public int maxHeight_Recursive(int[][] boxes) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization)
    public int maxHeight_Memo(int[][] boxes) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation)
    public int maxHeight_Tabulation(int[][] boxes) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized / Binary Search DP
    public int maxHeight_Optimal(int[][] boxes) {
        // TODO: Implement optimal approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of box types: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[][] boxes = new int[n][3]; // height, width, length
        System.out.println("Enter height, width, length for each box:");
        for (int i = 0; i < n; i++) {
            boxes[i][0] = scanner.nextInt();
            boxes[i][1] = scanner.nextInt();
            boxes[i][2] = scanner.nextInt();
        }
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.maxHeight_Memo(boxes));
        System.out.println("Tabulation:      " + sol.maxHeight_Tabulation(boxes));
        System.out.println("Space-Optimized: " + sol.maxHeight_Optimal(boxes));
        scanner.close();
    }
}
