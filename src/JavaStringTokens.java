import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
        String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
        // Write your code here.
        String[] arrayOfChars = s.split("");
        ArrayList<String> uniqueTokenList = new ArrayList<>();
        for(int i = 0; i < arrayOfChars.length; i++) {

            if(!arrayOfChars[i].matches(".*[a-zA-Z]+.*")) {
                continue;
            }
            String nextToken = "";
            while(arrayOfChars[i].matches(".*[a-zA-Z]+.*")) {
                nextToken += arrayOfChars[i];
                i++;
                if(i >= arrayOfChars.length) {
                    break;
                }
            }
            uniqueTokenList.add(nextToken);
        }
        System.out.println(uniqueTokenList.size());
        for(String token : uniqueTokenList) {
            System.out.println(token);
        }
        scan.close();
    }
}
