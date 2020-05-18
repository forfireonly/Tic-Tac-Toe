package tictactoe;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String winnningTeam = "";
   // public static boolean isFinished = false;
    public static String createRow(String one, String two, String three) {
        return String.format("| %s %s %s |", one, two, three);
    }
    public static boolean winCheckHorizontal(String[] ticTaeToeArray) {
        boolean isFinished = false;

        if  (ticTaeToeArray[0].equals(ticTaeToeArray[1]) && ticTaeToeArray[1].equals(ticTaeToeArray[2]) && !" ".equals(ticTaeToeArray[0])) {
            winnningTeam = ticTaeToeArray[0];

        }
        if (ticTaeToeArray[3].equals(ticTaeToeArray[4]) & ticTaeToeArray[4].equals(ticTaeToeArray[5]) && !" ".equals(ticTaeToeArray[3])) {
            winnningTeam = ticTaeToeArray[3];

        }
        if (ticTaeToeArray[6].equals(ticTaeToeArray[7]) && ticTaeToeArray[7].equals(ticTaeToeArray[8]) && !" ".equals(ticTaeToeArray[8])) {
            winnningTeam = ticTaeToeArray[6];

        }
        if (!"".equals(winnningTeam)) {
            System.out.printf("%s wins", winnningTeam);
            isFinished = true;
        }

        return isFinished;
    }
    public static boolean winCheckDiagonal(String[] ticTaeToeArray) {
        boolean isFinished = false;
        if (ticTaeToeArray[0].equals(ticTaeToeArray[4]) && ticTaeToeArray[4].equals(ticTaeToeArray[8]) && !" ".equals(ticTaeToeArray[0])) {
            winnningTeam = ticTaeToeArray[0];
            System.out.printf("%s wins", winnningTeam);
            isFinished = true;
        }
        if (ticTaeToeArray[2].equals(ticTaeToeArray[4]) && ticTaeToeArray[4].equals(ticTaeToeArray[6]) && !" ".equals(ticTaeToeArray[2])) {
            winnningTeam = ticTaeToeArray[2];
            System.out.printf("%s wins", winnningTeam);
            isFinished = true;
        }
        return isFinished;
    }

    public static boolean winCheckVertical(String[] ticTaeToeArray)  {
        boolean isFinished = false;

        if (ticTaeToeArray[0].equals(ticTaeToeArray[3]) && ticTaeToeArray[3].equals(ticTaeToeArray[6]) && !" ".equals(ticTaeToeArray[0])) {
            winnningTeam = ticTaeToeArray[0];

        }
        if (ticTaeToeArray[1].equals(ticTaeToeArray[4]) && ticTaeToeArray[4].equals(ticTaeToeArray[7]) && !" ".equals(ticTaeToeArray[7])) {
            winnningTeam = ticTaeToeArray[1];

        }
        if (ticTaeToeArray[2].equals(ticTaeToeArray[5]) && ticTaeToeArray[5].equals(ticTaeToeArray[8]) && !" ".equals(ticTaeToeArray[5])) {
            winnningTeam = ticTaeToeArray[2];

        }
        if (!"".equals(winnningTeam) ) {
            System.out.printf("%s wins", winnningTeam);
            isFinished = true;
        }
        return isFinished;
    }
    public static boolean drawCheck(String[] ticTaeToeArray) {
        int count = 0;
        boolean isFinished = false;
        for (String each : ticTaeToeArray) {
            if ("O".equals(each) || "X".equals(each)) {
                count++;
            }
        }
        if (count == 9 && "".equals(winnningTeam)) {
            System.out.println("Draw");
            isFinished = true;
        }
        return isFinished;
    }

    public static int arrayIndexConvert(int number1, int number2) {
        int arrayIndex = 0;
        switch (number2) {
            case 1:
                arrayIndex = number1 + 5;
                break;
            case 2:
                arrayIndex = number1 + 2;
                break;
            case 3:
                arrayIndex = number1 - 1;
                break;
            default:
        }
        return arrayIndex;
    }
    public static boolean checkPosition(int number1, int number2, String[] ticTaeToeArray) {
        int index = arrayIndexConvert(number1, number2);

        boolean result = false;
        if ("X".equals(ticTaeToeArray[index]) || "O".equals(ticTaeToeArray[index])) {
            System.out.println("This cell is occupied! Choose another one!");

        } else {
            result = true;
        }
       return result;

    }

    public static void printField(String[] ticTaeToeArray) {
        System.out.println("---------");
        System.out.println(createRow(ticTaeToeArray[0], ticTaeToeArray[1], ticTaeToeArray[2]));
        System.out.println(createRow(ticTaeToeArray[3], ticTaeToeArray[4], ticTaeToeArray[5]));
        System.out.println(createRow(ticTaeToeArray[6], ticTaeToeArray[7], ticTaeToeArray[8]));
        System.out.println("---------");
    }


    public static void main(String[] args) {
        // write your code here
        int row = 0;
        int column = 0;
        Scanner scn = new Scanner(System.in);
        int move = 2;
        String[] ticTaeToeArray = new String[9];
        for (int i = 0; i < 9; i++) {
            ticTaeToeArray[i] = " ";
        }
        printField(ticTaeToeArray);
        boolean isCorrectInput = false;
        boolean isFinished = false;
        int count = 0;

        while (true) {
            while (!isCorrectInput) {
                System.out.print("Enter the coordinates: ");

                try {
                    row = scn.nextInt();
                    isCorrectInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("You should enter numbers!");
                    isCorrectInput = false;
                    System.out.println(row);
                }
                if (isCorrectInput) {
                    try {
                        column = scn.nextInt();
                        isCorrectInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("You should enter numbers!");
                        isCorrectInput = false;
                        // System.out.println(column);
                    }
                }

                if (isCorrectInput) {
                    if (row > 3 || column > 3) {
                        isCorrectInput = false;
                        System.out.println("Coordinates should be from 1 to 3!");
                    }
                }

                if (isCorrectInput) {
                    isCorrectInput = checkPosition(row, column, ticTaeToeArray);
                }
            }

                int index = arrayIndexConvert(row, column);
                if (move % 2 == 0) {
                    ticTaeToeArray[index] = "X";
                } else {
                    ticTaeToeArray[index] = "O";
                }
                printField(ticTaeToeArray);
                move++;


            isFinished = winCheckHorizontal(ticTaeToeArray);
            if (!isFinished) {
                isFinished = winCheckDiagonal(ticTaeToeArray);
            }
            if (!isFinished) {
                isFinished = winCheckVertical(ticTaeToeArray);
            }


            if (!isFinished) {
                  isFinished = drawCheck(ticTaeToeArray);
            }

            if (isFinished) {
                break;
            }

            isCorrectInput = false;

        }
    }

}
