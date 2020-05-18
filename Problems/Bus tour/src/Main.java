import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String busBridges = scn.nextLine();
        String[] busBridgesNumbers = busBridges.split(" ");
        int busHeight = Integer.parseInt(busBridgesNumbers[0]);
        int bridges = Integer.parseInt(busBridgesNumbers[1]);
        int bridgeNumber = 0;
        while (scn.hasNextInt()) {
            int bridgeHeight = scn.nextInt();
            bridgeNumber++;
            if (busHeight >= bridgeHeight) {
                break;
            }
        }
        if (bridgeNumber == bridges) {
            System.out.println("Will not crash");
        } else {
            System.out.printf("Will crash on bridge %d", bridgeNumber);
        }

    }
}