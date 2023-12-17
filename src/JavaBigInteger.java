import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        BigInteger numOne = new BigInteger(scan.nextLine());
        BigInteger numTwo = new BigInteger(scan.nextLine());
        System.out.println(numOne.add(numTwo));
        System.out.println(numOne.multiply(numTwo));
    }
}
