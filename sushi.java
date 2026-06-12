import java.util.*;
// 111524202055 CSBS Surendhar l rmdec
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Read sizes of the two arrays
        int n = scan.nextInt();
        int m = scan.nextInt();

        long[] a = new long[n];
        long[] b = new long[m];

        // Read first array
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextLong();
        }

        // Read second array
        for (int i = 0; i < m; i++) {
            b[i] = scan.nextLong();
        }

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;
        int count = 0;

        // Greedy Two Pointer Approach
        while (i < n && j < m) {

            if (b[j] <= 2L * a[i]) {
                count++;
                i++;
                j++;
            } else {
                i++;
            }
        }

        System.out.println(count);
    }
}