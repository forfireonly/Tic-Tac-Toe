import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int columns = scn.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        int oneColumn = scn.nextInt();
        int twoColumn = scn.nextInt();

        for (int i = 0; i < rows; i++) {
            int temp = matrix[i][oneColumn];
            matrix[i][oneColumn] = matrix[i][twoColumn];
            matrix[i][twoColumn] = temp;
        }

         for (int[] each : matrix) {
             for (int another: each) {
                System.out.print(another + " ");
            }
            System.out.println();
        }
    }
}