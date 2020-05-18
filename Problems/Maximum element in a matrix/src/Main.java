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
        int max = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.print(x + " " + y);
    }
}