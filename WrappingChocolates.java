import java.util.*; 
 // 111524202055 Surendhar L
public class WrappingChocolates{ 
 
    public static void solve(Scanner sc){ 
 
        int N=sc.nextInt(); 
        int M=sc.nextInt(); 
 
        int[] chw=new int[N+1]; 
        int[] chl=new int[N+1]; 
        int[] bxw=new int[M+1]; 
        int[] bxl=new int[M+1]; 
 
        ArrayList<int[]> wv=new ArrayList<>(); 
 
        for(int i=1;i<=N;i++){ 
 
            int chocw=sc.nextInt(); 
 
            wv.add(new int[]{chocw,-i}); 
        } 
 
        for(int i=1;i<=N;i++){ 
            chl[i]=sc.nextInt(); 
        } 
 
        for(int i=1;i<=M;i++){ 
 
            int boxw=sc.nextInt(); 
 
            wv.add(new int[]{boxw,i}); 
        } 
 
        for(int i=1;i<=M;i++){ 
            bxl[i]=sc.nextInt(); 
        } 
 
        Collections.sort(wv,(a,b)->{ 
            if(a[0]!=b[0]) 
                return b[0]-a[0]; 
 
            return b[1]-a[1]; 
        }); 
 
        TreeSet<Integer> ms=new TreeSet<>(); 
 
        for(int[] p:wv){ 
 
            int w=p[0]; 
            int idx=p[1]; 
 
            if(idx>0){ 
 
                ms.add(bxl[idx]); 
            } 
            else{ 
 
                int need=chl[-idx]; 
 
                Integer val=ms.ceiling(need); 
 
                if(val!=null){ 
                    ms.remove(val); 
                } 
                else{ 
                    System.out.println("No"); 
                    return; 
                } 
            } 
        } 
 
        System.out.println("Yes"); 
    } 
 
    public static void main(String[] args){ 
 
        Scanner sc=new Scanner(System.in); 
 
        solve(sc); 
    } 
}