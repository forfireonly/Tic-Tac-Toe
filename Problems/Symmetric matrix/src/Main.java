import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int sizeMatrix = scn.nextInt();
        int[][] matrix = new int[sizeMatrix][sizeMatrix];
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        boolean symmetric = true;

        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
                if (!symmetric) {
                    break;
                }
            }
        }
        if (symmetric) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}