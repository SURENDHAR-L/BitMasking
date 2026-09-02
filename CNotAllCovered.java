import java.util.*; 
 
public class CNotAllCovered{ 
 
    static void solve() { 
 
        Scanner sc = new Scanner(System.in); 
 
        int N = sc.nextInt(); 
        int T = sc.nextInt(); 
 
        int[] walls = new int[N + 2]; 
 
        while (T-- > 0) { 
            int l = sc.nextInt(); 
            int r = sc.nextInt(); 
 
            walls[l]++; 
            walls[r + 1]--; 
        } 
 
        int res = 2000000; 
 
        for (int w = 1; w <= N; w++) { 
            walls[w] += walls[w - 1]; 
            res = Math.min(res, walls[w]); 
        } 
 
        System.out.println(res); 
    } 
 
    public static void main(String[] args) { 
        solve(); 
    } 
}