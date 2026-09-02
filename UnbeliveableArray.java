import java.util.Scanner;
import java.util.*;
// 1115224202055 Surendhar L
public class UnbeliveableArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        scan.nextLine();
        for(int i=1;i<=testCases;i++){
            System.out.println("Case " + i + ":");
            int size = scan.nextInt();
            int[] arr = new int[size];
            Set<Integer> set = new HashSet<>();
            int querries = scan.nextInt();
            for(int j=0;j<arr.length;j++){  
                arr[j] = scan.nextInt();
                set.add(arr[j]);
            }
            for(int cnt=0;cnt<querries;cnt++){
                int operation = scan.nextInt();
                if(operation == 1){
                    int val = scan.nextInt();
                    int replace = scan.nextInt();
                    if(!set.contains(val)){
                        continue;
                    }
                    for(int k=0;k<size;k++){
                        if(arr[k] == val){
                            arr[k] = replace;
                        }
                        set.remove(val);
                    }
                }else{
                    int index  = scan.nextInt();
                    System.out.println(arr[index-1]); 
                }
                scan.nextLine();
            }
        }
    }
}
