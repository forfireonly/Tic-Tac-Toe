import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int nLength = scn.nextInt();
        int nWidth = scn.nextInt();
        int kSegments = scn.nextInt();
        if (nLength * nWidth > kSegments && (kSegments % nWidth == 0 || kSegments % nLength == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}