import java.util.Scanner;
// 111524202055 Surendhar L
public class CRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int querries = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();
        // StringBuilder sb = new StringBuilder();
        // char[] arr = s.toCharArray();
        for(int i=0;i<querries;i++){
            int operation = scan.nextInt();
            if(operation == 1){
                int times = scan.nextInt();
                for(int j=0;j<times;j++){
                    char c = s.charAt(s.length()-1);
                    s = c + s.substring(0,s.length()-1);
                    // System.out.println(s);
                }
                // sb = new StringBuilder(s);
            }
            else{
                int index = scan.nextInt();
                // arr = s.toCharArray();
                // System.out.println(arr[index-1]);
                System.out.println(s.charAt(index-1));
            }
        }
    }
}

