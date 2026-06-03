import java.util.Scanner;
//111524202055 Surendhar L csbs rmdec
class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int flag1 = 0;

        for (int i = 0; i < str.length(); i++) {
            flag1 = flag1 | (1 << (str.charAt(i) - 'a'));
        }

        if (flag1 == (1 << 26) - 1) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
        scan.close();
    }
}
