package cap_02_02;

public class FindKthLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 2;

        int kthSmallest = findKthSmallest(arr, k);
        int kthLargest = findKthLargest(arr, k);

        System.out.println(k + "th smallest element is: " + kthSmallest);
        System.out.println(k + "th largest element is: " + kthLargest);
    }

    static int findKthSmallest(int[] arr, int k) {
        java.util.Arrays.sort(arr);
        return arr[k - 1];
    }

    static int findKthLargest(int[] arr, int k) {
        java.util.Arrays.sort(arr);
        return arr[arr.length - k];
    }
}
