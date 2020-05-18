import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int rowsNumber = scn.nextInt();
        int columnsNumber = scn.nextInt();
        int[][] seats = new int[rowsNumber][columnsNumber];
        for (int i = 0; i < rowsNumber; i++) {
            for (int j = 0; j < columnsNumber; j++) {
                seats[i][j] = scn.nextInt();
            }
        }
        int kTickets = scn.nextInt();
        int rowToBuy = 0;
        for (int i = 0; i < rowsNumber; i++) {
            int seatAvailable = 0;
            for (int j = 0; j < columnsNumber; j++) {
                if (seats[i][j] == 0) {
                    seatAvailable++;
                } else  {
                    seatAvailable = 0;
                }
                if (seatAvailable >= kTickets) {
                    rowToBuy = i + 1;
                    break;
                }
            }
            if (seatAvailable >= kTickets) {
                break;
            }
        }
        System.out.println(Math.max(rowToBuy, 0));

    }
}