package cap_02_07.greedy;

import java.util.ArrayList;
import java.util.List;

public class DateTimeArraySorting {
    public static void main(String[] args) {
        List<List<String>> dateTimeList = new ArrayList<List<String>>();

        dateTimeList.add(List.of("2024-06-01", "10:00"));
        dateTimeList.add(List.of("2024-06-01", "09:00"));
        dateTimeList.add(List.of("2024-06-02", "08:00"));
        dateTimeList.add(List.of("2024-06-01", "11:00"));
        dateTimeList.add(List.of("2024-06-02", "07:00"));

        dateTimeList.sort((a, b)-> {
            int dateComparison = a.get(0).compareTo(b.get(0));
            if (dateComparison != 0) {
                return dateComparison;
            } else {
                return a.get(1).compareTo(b.get(1));
            }
        });

        System.out.println(dateTimeList);
    }
}
