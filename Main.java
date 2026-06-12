import java.util.Scanner;

public class Main {
// 111524202055 Surendhar L csbs rmdec
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String s1 = scan.next();

        System.out.print("Enter string 2: ");
        String s2 = scan.next();

        int r = s1.length();
        int c = s2.length();

        int[][] ar = new int[r][c];
        int l = 0;

        // Initialize first column
        for (int i = 0; i < r; i++) {
            ar[i][0] = 0;
        }

        // Initialize first row
        for (int i = 0; i < c; i++) {
            ar[0][i] = 0;
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (s1.charAt(i) == s2.charAt(j)) {

                    if (i == 0 || j == 0) {
                        ar[i][j] = 1;
                    } else {
                        ar[i][j] = ar[i - 1][j - 1] + 1;
                    }

                    if (ar[i][j] > l) {
                        l = ar[i][j];
                    }

                } else {
                    ar[i][j] = 0;
                }
            }
        }

        System.out.println("Longest Common Substring length: " + l);

    }
}