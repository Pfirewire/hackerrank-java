import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.security.*;
import java.math.BigDecimal;

//class Result {
//
//    /*
//     * Complete the 'findDay' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts following parameters:
//     *  1. INTEGER month
//     *  2. INTEGER day
//     *  3. INTEGER year
//     */
//
//    public static String findDay(int month, int day, int year) {
//        String dayOfWeek = "";
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(year, month, day);
//        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
//            case 1:
//                dayOfWeek = "SUNDAY";
//                break;
//            case 2:
//                dayOfWeek = "MONDAY";
//                break;
//            case 3:
//                dayOfWeek = "TUESDAY";
//                break;
//            case 4:
//                dayOfWeek = "WEDNESDAY";
//                break;
//            case 5:
//                dayOfWeek = "THURSDAY";
//                break;
//            case 6:
//                dayOfWeek = "FRIDAY";
//                break;
//            case 7:
//                dayOfWeek = "SATURDAY";
//                break;
//        }
//        return dayOfWeek;
//    }
//
//}

public class Solution {

//    private static Scanner scan = new Scanner(System.in);
//
//    private static int B = scan.nextInt();
//    private static int H = scan.nextInt();
//
//    private static boolean flag = B > 0 && H > 0;
//
//    static {
//        if(!flag) {
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
//        }
//    }



    public static void main(String[] args) throws IOException {

//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();
//
//        scan.close();
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//            //Complete this line
//            System.out.printf("%-15s%03d%n", s1, x);
//        }
//        System.out.println("================================");

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(bufferedReader.readLine().trim());
//        for(int i = 1; i <= 10; i++) {
//            System.out.printf("%d x %d = %d%n", N, i, (N*i));
//        }
//
//        bufferedReader.close();

//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int total = a;
//            for(int j = 0; j < n; j++) {
//                total += (Math.pow(2, j)) * b;
//                if(j == n - 1) {
//                    System.out.println(total);
//                } else {
//                    System.out.printf("%d ", total);
//                }
//            }
//        }
//        in.close();

//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//
//        for(int i=0;i<t;i++)
//        {
//
//            try
//            {
//                long x=sc.nextLong();
//                System.out.println(x+" can be fitted in:");
//                if(x>=-128 && x<=127)System.out.println("* byte");
//                if(x >= -32768 && x <= 32767) System.out.println("* short");
//                if(x >= Math.pow(-2, 31) && x <= (Math.pow(2, 31) -1)) System.out.println("* int");
//                if(x >= Math.pow(-2, 63) && x <= (Math.pow(2, 63) -1)) System.out.println("* long");
//                //Complete the code
//            }
//            catch(Exception e)
//            {
//                System.out.println(sc.next()+" can't be fitted anywhere.");
//            }
//
//        }

//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner scan = new Scanner(System.in);
//        int lineNumber = 1;
//        do {
//            String line = scan.nextLine();
//            System.out.printf("%d %s%n", lineNumber++, line);
//        } while(scan.hasNext());

//        if(flag){
//            int area=B*H;
//            System.out.print(area);
//        }

//        DoNotTerminate.forbidExit();
//
//        try {
//            Scanner in = new Scanner(System.in);
//            int n = in.nextInt();
//            in.close();
//            //String s=???; Complete this line below
//            String s = String.valueOf(n);
//            //Write your code here
//
//
//            if (n == Integer.parseInt(s)) {
//                System.out.println("Good job");
//            } else {
//                System.out.println("Wrong answer.");
//            }
//        } catch (DoNotTerminate.ExitTrappedException e) {
//            System.out.println("Unsuccessful Termination!!");
//        }

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
//
//        String res = Result.findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//
//        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
//        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
//        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
//        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
//        // Write your code here.
//
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);

//        //Input
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        String []s=new String[n+2];
//        for(int i=0;i<n;i++){
//            s[i]=sc.next();
//        }
//        sc.close();
//
//        //Write your code here
//        BigDecimal []bigDecimals = new BigDecimal[n];
//        for(int i = 0; i < n; i++) {
//            bigDecimals[i] = new BigDecimal(s[i]);
//        }
//        String tempString;
//        BigDecimal tempBigDecimal;
//        for(int i = 1; i < n; i++) {
//            for(int j = i; j >= 1; j--) {
//                if(bigDecimals[j].compareTo(bigDecimals[j-1]) > 0) {
//                    tempString = s[j-1];
//                    tempBigDecimal = bigDecimals[j-1];
//
//                    s[j-1] = s[j];
//                    bigDecimals[j-1] = bigDecimals[j];
//
//                    s[j] = tempString;
//                    bigDecimals[j] = tempBigDecimal;
//                }
//            }
//        }
//
//        //Output
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(s[i]);
//        }

//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        // Complete this line
//        // Complete this line
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        // Complete this line
//        // Complete this line

//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            String IP = in.next();
//            System.out.println(IP.matches(new MyRegex().pattern));
//        }


    }
}

//class MyRegex {
//    public String pattern = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
//}

//The following class will prevent you from terminating the code using exit(0)!
//class DoNotTerminate {
//
//    public static class ExitTrappedException extends SecurityException {
//
//        private static final long serialVersionUID = 1;
//    }
//
//    public static void forbidExit() {
//        final SecurityManager securityManager = new SecurityManager() {
//            @Override
//            public void checkPermission(Permission permission) {
//                if (permission.getName().contains("exitVM")) {
//                    throw new ExitTrappedException();
//                }
//            }
//        };
//        System.setSecurityManager(securityManager);
//    }
//}