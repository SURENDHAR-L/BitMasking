import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int max = Math.max(arr[0],arr[1]);
        int min = Math.max(arr[0],arr[1]);
        for(int i=0;i<n;i++){
            if(arr[i] > max){
                min = max;
                max = arr[i];
            }
            else if(arr[i] > min){
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);
    }
}