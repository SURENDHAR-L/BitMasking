import java.util.*;

public class RotateFunction {

    // 111524202055 Surendhar L

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        long fn = 0;
        long max = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            fn += (i * nums[i]);
        }

        max = fn;

        for (int last = n - 1; last > 0; last--) {
            fn = fn - (nums[last] * (n - 1))
                    + (sum - nums[last]);

            max = Math.max(max, fn);
        }

        System.out.println("Maximum Rotate Function: " + max);
    }
}