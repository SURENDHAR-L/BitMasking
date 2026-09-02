import java.util.*; 
 // 111524202055 Surendhar L
public class DisjointSet { 
 
    public static int find(int[] ldr,int node){ 
 
        if(ldr[node]!=node){ 
            ldr[node]=find(ldr,ldr[node]); 
        } 
 
        return ldr[node]; 
    } 
 
    public static void join(int[] ldr,int lt,int rt){ 
 
        int ldrlt=find(ldr,lt); 
        int ldrrt=find(ldr,rt); 
 
        ldr[ldrlt]=ldrrt; 
    } 
 
    public static void solve(Scanner sc){ 
 
        int N=sc.nextInt(); 
        int M=sc.nextInt(); 
 
        int[] ldr=new int[N+1]; 
 
        for(int i=1;i<=N;i++){ 
            ldr[i]=i; 
        } 
 
        for(int e=1;e<=M;e++){ 
 
            int lt=sc.nextInt(); 
            int rt=sc.nextInt(); 
 
            join(ldr,lt,rt); 
        } 
 
        HashSet<Integer> st=new HashSet<>(); 
 
        for(int i=1;i<=N;i++){ 
 
            System.out.print(find(ldr,i)+" "); 
 
            st.add(find(ldr,i)); 
        } 
 
        for(int val:st){ 
            System.out.print(val+" "); 
        } 
 
        System.out.print(st.size()); 
    } 
 
    public static void main(String[] args){ 
 
        Scanner sc=new Scanner(System.in); 
 
        solve(sc); 
    } 
}