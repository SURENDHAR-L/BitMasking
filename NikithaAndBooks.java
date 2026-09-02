import java.util.*;
// 111524202055 Surendhar L
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int carry = 0;
        for(int i=1;i<=n;i++){
            if(arr[i-1] == i){
                continue;
            }
            else if(arr[i-1] > i){
                carry = arr[i-1] - i;
                arr[i-1] = i;
            }else if(arr[i-1] < i){
                int needed = i - arr[i-1];
                if(carry >= needed){
                    arr[i-1] += needed;
                    carry -= needed;
                }else{
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println("Success");
    }
}
