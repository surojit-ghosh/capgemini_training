package cap_19_02.stream_api;

import java.util.List;

public class StreamSample {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> oddNumbers = filterOdd(arr);
        System.out.println(oddNumbers);
    }
    private static List<Integer> filterOdd(Integer[] arr) {
        return List.of(arr).stream()
                .filter(n -> n % 2 != 0)
                .toList();
    }
}
