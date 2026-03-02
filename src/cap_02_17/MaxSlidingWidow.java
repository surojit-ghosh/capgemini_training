package cap_02_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSlidingWidow {
    public static int[] maxSlidingWindow(int[] arr, int k) {
        int[] ans = new int[arr.length - k + 1];
        int a = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            for (int j = i + 1; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            ans[a++] = max;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = maxSlidingWindow(arr, k);
        System.out.println(Arrays.toString(result));
    }
}
