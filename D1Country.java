import java.util.*;
public class D1Country {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int villages = scan.nextInt();
        int size = villages;
        int[] locations = new int[villages];
        for(int i=0;i<villages;i++){
            locations[i] = scan.nextInt();
        }
        long[] pSum = new long[villages+1];
        for(int i=1;i<=size;i++){
            int curr = scan.nextInt();
            pSum[i] = pSum[i-1] + curr;  
        }
        int querries = scan.nextInt();
        long[] ans = new long[querries];
        for(int i=0;i<querries;i++){
            int start = scan.nextInt();
            int end = scan.nextInt();
            ans[i] = peoplesLive(locations,pSum,start,end);
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }

    public static long peoplesLive(int[] locations,long[] pSum,int start,int end){
        int lindex = lowerBound(locations,start);
        int uindex = upperBound(locations,end);
        long finalPeople = calculatePeople(lindex,uindex,pSum);
        return finalPeople;
    }

    public static int lowerBound(int[] locations,int target){
        int start = 0;
        int end = locations.length-1;
        while(start+1 < end){
            int mid = start + (end-start)/2;
            if(locations[mid] < target){
                start = mid;
            }else{
                end = mid;
            }
        }
        if(locations[start] == target || locations[start] > target){
            return start;
        }else{
            return start+1;
        }
    }
    public static int upperBound(int[] locations,int target){
        int start = 0;
        int end = locations.length-1;
        while(start+1 < end){
            int mid = start + (end-start)/2;
            if(locations[mid] < target){
                start = mid;
            }else{
                end = mid;
            }
        }
        if(locations[end] > target){
            return end;
        }
        return end+1;
    }
    public static long calculatePeople(int start,int end,long[] arr){
        return arr[end] - arr[start];
    }
}
