import java.util.Arrays;
import java.util.Scanner;
// 111524202055 Surendhar L
public class StaticRangeMinimumQuerry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int querries = scan.nextInt();
        int[] arr = new int[size+1];
        for(int i=1;i<=size;i++){
            arr[i] = scan.nextInt();
        }
        int[] mins = new int[querries];
        int k = 0;
        for(int i=1;i<=querries;i++){
            int left = scan.nextInt();
            int right = scan.nextInt();
            int min = Integer.MAX_VALUE;
            for(int j=left;j<=right;j++){
                if(arr[j] < min){
                    min = arr[j];
                }
            }
            mins[k++] = min;
        }
        for(int i=0;i<mins.length;i++){
            System.out.println(mins[i]);
        }
    }
}
