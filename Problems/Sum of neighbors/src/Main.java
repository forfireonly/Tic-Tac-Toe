import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int numberOfRows = 0;
    public static int numberOfColumns = 0;
    public static int[][] matrixInteger;
    public static int[][] biggerMatrix;
    public static ArrayList<String[]> matrix;

    public static void turnInteger() {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                matrixInteger[i][j] = Integer.parseInt(matrix.get(i)[j]);
            }
        }
    }

    public static void fillCore() {
        for (int i = 1; i < numberOfRows + 1; i++) {
            for (int j = 1; j < numberOfColumns + 1; j++) {
                biggerMatrix[i][j] = matrixInteger[i - 1][j - 1];
            }
        }
    }

    public static void fillTop() {
        for (int i = 1; i <= numberOfColumns;  i++) {
            biggerMatrix[0][i] = matrixInteger[numberOfRows - 1][i - 1];
        }
    }

    public static void fillBottom() {
        for (int i = 1; i <= numberOfColumns;  i++) {
            biggerMatrix[numberOfRows + 1][i] = matrixInteger[0][i - 1];
        }
    }

    public static void fillLeft() {
        for (int i = 1; i <= numberOfRows;  i++) {
            biggerMatrix[i][0] = matrixInteger[i - 1][numberOfColumns - 1];
        }
    }

    public static void fillRight() {
        for (int i = 1; i < biggerMatrix.length - 1;  i++) {
            biggerMatrix[i][numberOfColumns + 1] = matrixInteger[i - 1][0];
        }
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        matrix = new ArrayList<>();

        while (scn.hasNext()) {
            String nextString = scn.nextLine();
            if (!"end".equals(nextString)) {
                String[] myString = nextString.split(" ");
                numberOfColumns = myString.length;
                matrix.add(myString);
                numberOfRows++;
            }
        }

        matrixInteger = new int[numberOfRows][numberOfColumns];

        turnInteger();

        int[][] modifiedMatrix = new int[numberOfRows][numberOfColumns];
        biggerMatrix = new int[numberOfRows + 2][numberOfColumns + 2];

        fillCore();

        fillTop();

        fillBottom();

        fillLeft();

        fillRight();

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                modifiedMatrix[i][j] = biggerMatrix[i][j + 1] + biggerMatrix[i + 1][j + 2] +
                        biggerMatrix[i + 2][j + 1] + biggerMatrix[i + 1][j];
            }
        }

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(modifiedMatrix[i][j] + " ");
            }
            System.out.println();

        }

    }
}