import java.util.Scanner;
class Main {
    public static int number = 0;
    public static int nNumbersSquare = 0;

    public static void fillingMatrixLeftToRight(int start, int end, int[][] spiral) {
        for (int topI = start; topI <= end; topI++) {
            number++;
            if (number > nNumbersSquare) {
                break;
            }
            spiral[start][topI] = number;
        }
    }

    public static void fillingMatrixTopToBottom(int start, int end, int[][] spiral, int indexConstant) {
        for (int rightI = start; rightI <= end; rightI++) {
            number++;
            if (number > nNumbersSquare) {
                break;
            }
            spiral[rightI][indexConstant] = number;
        }
    }

    public static void fillingMatrixRightToLeft(int start, int end, int[][] spiral, int indexConstant) {
        for (int bottomI = start; bottomI >= end; bottomI--) {
            number++;
            if (number > nNumbersSquare) {
                break;
            }
            spiral[indexConstant][bottomI] = number;
        }
    }

    public static void fillingMatrixBottomToTop(int start, int end, int[][] spiral, int indexConstant) {
        for (int leftI = start; leftI >= end; leftI--) {
            number++;
            if (number > nNumbersSquare) {
                break;
            }
            spiral[leftI][indexConstant] = number;
        }
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int nNumbers = scn.nextInt();
        int[][] spiral = new int[nNumbers][nNumbers];
        nNumbersSquare = nNumbers * nNumbers;
        int topRow = 0;
        int lastRow = nNumbers - 1;
        int firstColumn = 0;
        int lastColumn = nNumbers - 1;

        while (number <= nNumbersSquare) {

            fillingMatrixLeftToRight(topRow, lastColumn, spiral);

            topRow++;

            fillingMatrixTopToBottom(topRow, lastRow, spiral, lastColumn);

            lastColumn--;

            fillingMatrixRightToLeft(lastColumn, firstColumn, spiral, lastRow);

            lastRow--;

            fillingMatrixBottomToTop(lastRow, topRow, spiral, firstColumn);

            firstColumn++;

        }
        for (int i = 0; i < nNumbers; i++) {
            for (int j = 0; j < nNumbers; j++) {
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }

    }
}