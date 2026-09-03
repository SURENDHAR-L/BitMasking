import java.io.*;
import java.util.*;

// 111524202055
public class COnADiet {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        long[] val = new long[(int)n];
        boolean[] diff = new boolean[(int)n];

        long curr = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            val[i] = Long.parseLong(st.nextToken());

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < n; i++) {

            if (i >= m && diff[(int)(i - m)] == true)
                curr -= val[(int)(i - m)];

            if (curr + val[i] <= k) {
                curr += val[i];
                out.append("Yes\n");
                diff[i] = true;
            }
            else {
                out.append("No\n");
            }
        }

        System.out.print(out);
    }
}
