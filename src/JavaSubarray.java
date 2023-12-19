import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] stringArray = scan.nextLine().split(" ");
        int[] array = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }
        int negativeSubarrays = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j <= array.length; j++) {
                int[] subarray = Arrays.copyOfRange(array, i, j);
                if(Arrays.stream(subarray).sum() < 0) {
                    negativeSubarrays++;
                }
            }
        }
        System.out.println(negativeSubarrays);
    }
}
