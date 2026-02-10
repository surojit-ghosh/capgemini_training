package cap_05_02.heap;

public class SlidingWindow {
//    Example: {1, 2, 3, 6, 8, 9}
//    Output: {6, 8, 9}
//    Explanation: For window size 3, the maximums are 3 (from {1,2,3}), 6 (from {2,3,6}), 8 (from {3,6,8}), and 9 (from {6,8,9}).

    public static int[] maxInSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            result[i] = max;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 8, 9};
        int k = 3;
        int[] result = maxInSlidingWindow(arr, k);
        System.out.print("Max in sliding window: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
