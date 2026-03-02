package cap_02_17;

import java.util.*;

public class FindKOccurrences {
    static int[] findKOccurrences(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < k && i < list.size(); i++) {
            ans[i] = list.get(i).getKey();
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = findKOccurrences(arr, k);

            System.out.print(Arrays.toString(result));
    }
}
