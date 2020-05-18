import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int  sizeOfArray = scn.nextInt();
        int[] myArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            myArray[i] = scn.nextInt();
        }
        int number = scn.nextInt();
        int sum = 0;

        for (int each: myArray) {
            if (each > number) {
                sum += each;
            }
        }
        System.out.print(sum);

    }
}