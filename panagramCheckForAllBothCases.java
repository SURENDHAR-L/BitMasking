import java.util.Scanner;
// 111524202055 Surendhar L csbs rmdec
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int flaga = 0;
        int flagb = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                flaga = flaga | (1 << (ch - 'a'));
            }

            if (ch >= 'A' && ch <= 'Z') {
                flagb = flagb | (1 << (ch - 'A'));
            }
        }

        if (flaga == (1 << 26) - 1 && flagb == (1 << 26) - 1) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
