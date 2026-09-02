// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
// import java.util.StringTokenizer;
import java.util.*;
class StaticRangeSumQuerries {

    public static void main(String[] args) {
        // FastScanner fs = new FastScanner();
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int querries = scan.nextInt();
        int[] arr = new int[size+1];
        for(int i=1;i<=size;i++){
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int[] sumArr = new int[size+1];
        for(int i=0;i<=size;i++){
            sum += arr[i];
            sumArr[i] = sum;
        }
        int[] ans = new int[querries];
        for(int i=0;i<querries;i++){
            int start = scan.nextInt();
            int end = scan.nextInt();
            ans[i] = sumArr[end] - sumArr[start-1];
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]); 
        }
        scan.close();

    }
}
