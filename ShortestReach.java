import java.util.*; 
 // 111524202055 Surendhar L
public class ShortestReach{ 
 
    public static void solve(Scanner sc){ 
 
        int n=sc.nextInt(); 
        int m=sc.nextInt(); 
 
        ArrayList<Integer>[] g=new ArrayList[n+1]; 
 
        for(int i=1;i<=n;i++){ 
            g[i]=new ArrayList<>(); 
        } 
 
        for(int i=0;i<m;i++){ 
 
            int a=sc.nextInt(); 
            int b=sc.nextInt(); 
 
            g[a].add(b); 
            g[b].add(a); 
        } 
 
        int s=sc.nextInt(); 
 
        int[] dist=new int[n+1]; 
        Arrays.fill(dist,-1); 
 
        Queue<Integer> q=new LinkedList<>(); 
 
        q.add(s); 
        dist[s]=0; 
 
        while(!q.isEmpty()){ 
 
            int curr=q.poll(); 
 
            for(int next:g[curr]){ 
 
                if(dist[next]==-1){ 
 
                    dist[next]=dist[curr]+6; 
                    q.add(next); 
                } 
            } 
        } 
 
        for(int i=1;i<=n;i++){ 
 
            if(i==s) 
                continue; 
 
            System.out.print(dist[i]+" "); 
        } 
 
        System.out.println(); 
    } 
 
    public static void main(String[] args){ 
 
        Scanner sc=new Scanner(System.in); 
 
        int t=sc.nextInt(); 
 
        for(int i=0;i<t;i++){ 
            solve(sc); 
        } 
    } 
}
