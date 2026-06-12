import java.util.Scanner;

public class Main {
// 111524202055 SURENDHAR L CSBS RMDEC

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String s1 = sc.next();

        System.out.print("Enter string 2: ");
        String s2 = sc.next();

        int r = s1.length();
        int c = s2.length();

        int[][] ar = new int[r][c];

        for (int i = 0; i < r; i++) {
            ar[i][0] = 0;
        }

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

                } else {

                    if (i == 0 && j != 0) {
                        ar[i][j] = ar[i][j - 1];
                    } else if (i != 0 && j == 0) {
                        ar[i][j] = ar[i - 1][j];
                    } else if (i == 0 && j == 0) {
                        ar[i][j] = 0;
                    } else {
                        ar[i][j] = Math.max(ar[i][j - 1], ar[i - 1][j]);
                    }
                }
            }
        }

        System.out.println("Longest Common Subsequence length: " + ar[r - 1][c - 1]);

    }
}