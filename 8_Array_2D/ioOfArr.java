import java.util.Scanner;

public class ioOfArr {

   
    public static boolean search(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {          
            for (int j = 0; j < matrix[0].length; j++) {   
                if (matrix[i][j] == target) {
                    System.out.printf("Element %d found at index (%d,%d)%n", target, i, j);
                    return true;       
                }
            }
        }
        System.out.println("Element not found 🥹");
        return false;                  
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 × 3 matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix you entered:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        boolean found = search(matrix, 8);     
        System.out.println("Search result : " + found);
    }
}
