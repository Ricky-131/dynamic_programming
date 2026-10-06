import java.util.Scanner;

public class Solution {

    // Approach 1: Brute Force Recursion -> O(2^N) Time | O(N) Space
    public int minHeightShelves_Recursive(int[][] books, int shelfWidth) {
        // TODO: Implement recursive approach
        return 0;
    }

    // Approach 2: Top-Down DP (Memoization) -> O(N) Time | O(N) Space
    public int minHeightShelves_Memo(int[][] books, int shelfWidth) {
        // TODO: Implement memoized approach
        return 0;
    }

    // Approach 3: Bottom-Up DP (Tabulation) -> O(N) Time | O(N) Space
    public int minHeightShelves_Tabulation(int[][] books, int shelfWidth) {
        // TODO: Implement tabulation approach
        return 0;
    }

    // Approach 4: Space-Optimized DP -> O(N) Time | O(1) Space
    public int minHeightShelves_Optimal(int[][] books, int shelfWidth) {
        // TODO: Implement space-optimized approach
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        if (!scanner.hasNextInt()) { scanner.close(); return; }
        int n = scanner.nextInt();
        int[][] books = new int[n][2];
        System.out.println("Enter thickness and height for each book:");
        for (int i = 0; i < n; i++) {
            books[i][0] = scanner.nextInt();
            books[i][1] = scanner.nextInt();
        }
        System.out.print("Enter shelf width: ");
        int shelfWidth = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println();
        System.out.println("--- Outputs ---");
        System.out.println("Memoization:     " + sol.minHeightShelves_Memo(books, shelfWidth));
        System.out.println("Tabulation:      " + sol.minHeightShelves_Tabulation(books, shelfWidth));
        System.out.println("Space-Optimized: " + sol.minHeightShelves_Optimal(books, shelfWidth));
        scanner.close();
    }
}
