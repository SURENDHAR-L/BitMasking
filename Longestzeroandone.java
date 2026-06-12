import java.util.*;
// 111524202055 Surendhar L csbs rmdec
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a binary string: ");
        String str = scan.next();

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        // Initial sum
        map.put(0, -1);

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '0') {
                sum--;
            } else {
                sum++;
            }

            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        System.out.println("Longest substring with equal number of 0's and 1's: " + maxLength);
    }
}