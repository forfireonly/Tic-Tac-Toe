import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                        matrix[i][j] = j - i;
                        if (matrix[i][j] < 0) {
                            matrix[i][j] *= -1;
                        }
                }
            }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}