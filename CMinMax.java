import java.util.*; 
 // 111524202055 Surendhar L
public class CMinMax { 
 
    public static void main(String[] args){ 
 
        Scanner sc=new Scanner(System.in); 
 
        int N=sc.nextInt(); 
 
        int[] a=new int[N+1]; 
 
        for(int i=1;i<=N;i++){ 
            a[i]=sc.nextInt(); 
        } 
 
        int same=0; 
        int exchg=0; 
 
        for(int i=1;i<=N;i++){ 
 
            if(i==a[i]){ 
                same++; 
            } 
            else if(i==a[a[i]]){ 
                exchg++; 
            } 
        } 
 
        long ans=exchg/2+(1L*same*(same-1))/2; 
 
        System.out.println(ans); 
 
        sc.close(); 
    } 
}