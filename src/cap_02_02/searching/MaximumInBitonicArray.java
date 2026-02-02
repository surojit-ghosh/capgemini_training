package cap_02_02.searching;

public class MaximumInBitonicArray {
    static int findMaximum(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return arr[left];
    }

    public static void main(String[] args) {
        int[] bitonicArray = {1, 3, 8, 12, 4, 2};
        int maxElement = findMaximum(bitonicArray);
        System.out.println("Maximum element in the bitonic array is: " + maxElement);
    }
}
