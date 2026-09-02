import java.util.*; 
 
public class TwoDigitStrings{ 
 
    public static void solve(Scanner sc) { 
 
        String x=sc.next(); 
        String y=sc.next(); 
 
        int R=x.length(); 
        int C=y.length(); 
 
        int[] mx=new int[R]; 
        int[] my=new int[C]; 
 
        mx[0]=x.charAt(0)-'0'; 
        my[0]=y.charAt(0)-'0'; 
 
        for(int i=1;i<R;i++){ 
            mx[i]=(mx[i-1]+(x.charAt(i)-'0'))%10; 
        } 
 
        for(int i=1;i<C;i++){ 
            my[i]=(my[i-1]+(y.charAt(i)-'0'))%10; 
        } 
 
        if(mx[R-1]!=my[C-1]){ 
            System.out.println(-1); 
            return; 
        } 
 
        int[][] dp=new int[R+1][C+1]; 
 
        for(int row=1;row<=R;row++){ 
            for(int col=1;col<=C;col++){ 
 
                if(mx[row-1]==my[col-1]){ 
                    dp[row][col]=dp[row-1][col-1]+1; 
                } 
                else{ 
                    dp[row][col]=Math.max(dp[row-1][col],dp[row][col-1]); 
                } 
            } 
        } 
 
        System.out.println(dp[R][C]); 
    } 
 
    public static void main(String[] args){ 
 
        Scanner sc=new Scanner(System.in); 
 
        int t=sc.nextInt(); 
 
        for(int i=0;i<t;i++){ 
            solve(sc); 
        } 
    } 
}