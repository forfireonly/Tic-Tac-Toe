
class Main {
    public static void main(String[] args) {
        // put your code here
        java.util.Scanner scn = new java.util.Scanner(System.in);
        int firstNumber = scn.nextInt();
        int secondNumber = scn.nextInt();
        int[][] rectangularArray = new int[firstNumber][secondNumber];
        int[][] rottatedArray = new int[secondNumber][firstNumber];
        for (int i = 0; i < firstNumber; i++) {
            for (int j = 0; j < secondNumber; j++) {
                rectangularArray[i][j] = scn.nextInt();
                rottatedArray[j][firstNumber - 1 - i ] = rectangularArray[i][j];
            }
        }

        for (int i = 0; i < secondNumber; i++) {
            for (int j = 0; j < firstNumber; j++) {
                System.out.print(rottatedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}