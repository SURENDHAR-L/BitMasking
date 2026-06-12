import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int z = scan.nextInt();

        int MAX = 200000;
        int[] dif = new int[MAX + 2];

        for (int i = 0; i < n; i++) {
            int l = scan.nextInt();
            int r = scan.nextInt();

            dif[l]++;
            dif[r + 1]--;
        }

        int[] pref = new int[MAX + 1];
        int cover = 0;

        for (int i = 1; i <= MAX; i++) {
            cover += dif[i];

            if (cover >= m) {
                pref[i] = pref[i - 1] + 1;
            } else {
                pref[i] = pref[i - 1];
            }
        }

        StringBuilder sbuilder = new StringBuilder();

        while (z-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            sbuilder.append(pref[b] - pref[a - 1]).append('\n');
        }

        System.out.print(sbuilder);

	}
}