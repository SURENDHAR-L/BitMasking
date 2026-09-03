import java.io.*; 
import java.util.*; 
 
// 111524202055 
public class DLazyFaith{ 
    public static void main(String[] args) throws Exception { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
 
        StringTokenizer st = new StringTokenizer(br.readLine()); 
 
        int A = Integer.parseInt(st.nextToken()); 
        int B = Integer.parseInt(st.nextToken()); 
        int Q = Integer.parseInt(st.nextToken()); 
 
        long[] s = new long[A + 2]; 
        long[] t = new long[B + 2]; 
 
        s[0] = -1000000000000L; 
        t[0] = -1000000000000L; 
 
        st = new StringTokenizer(br.readLine()); 
 
        for (int i = 1; i <= A; i++) { 
            s[i] = Long.parseLong(st.nextToken()); 
        } 
 
        s[A + 1] = 1000000000000L; 
 
        st = new StringTokenizer(br.readLine()); 
 
        for (int i = 1; i <= B; i++) { 
            t[i] = Long.parseLong(st.nextToken()); 
        } 
 
        t[B + 1] = 1000000000000L; 
 
        StringBuilder out = new StringBuilder(); 
 
        for (int q = 0; q < Q; q++) { 
            long v = Long.parseLong(br.readLine()); 
 
            int i = Arrays.binarySearch(s, v); 
 
            if (i < 0) 
                i = -i - 1; 
 
            int j = Arrays.binarySearch(t, v); 
 
            if (j < 0) 
                j = -j - 1; 
 
            long ans = 1000000000000000000L; 
 
            long[] x = {s[i], s[i - 1]}; 
            long[] y = {t[j], t[j - 1]}; 
 
            for (long a : x) { 
                for (long b : y) { 
                    long temp = Math.min( 
                        Math.abs(v - a), 
                        Math.abs(v - b) 
                    ) + Math.abs(a - b); 
 
                    ans = Math.min(ans, temp); 
                } 
            } 
 
            out.append(ans).append('\n'); 
        } 
 
        System.out.print(out); 
    } 
}