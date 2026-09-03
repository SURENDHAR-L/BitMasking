import java.io.*;
import java.util.*;

// 111524202055
public class ChangeSchool {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] vec = new int[k + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int cl = Integer.parseInt(st.nextToken());
            vec[cl]++;
        }

        int m = 0;

        for (int i = 1; i <= k; i++) {
            m = Math.max(m, vec[i]);
        }

        int cnt = 0;

        for (int i = 1; i <= k; i++) {
            if (m - vec[i] <= 1)
                cnt++;
        }

        System.out.println(cnt);
    }
}