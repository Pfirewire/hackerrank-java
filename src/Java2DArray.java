import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int largestHourglass = -999999;

        for (int i = 0; i < arr.size() - 2; i++) {
            List<Integer> firstRow = arr.get(i);
            List<Integer> secondRow = arr.get(i + 1);
            List<Integer> thirdRow = arr.get(i + 2);
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                int hourglass = firstRow.get(j) + firstRow.get(j + 1) + firstRow.get(j + 2)
                        + secondRow.get(j + 1)
                        + thirdRow.get(j) + thirdRow.get(j + 1) + thirdRow.get(j + 2);
                if(hourglass > largestHourglass) {
                    largestHourglass = hourglass;
                }
            }
        }

        System.out.println(largestHourglass);

        bufferedReader.close();
    }
}
