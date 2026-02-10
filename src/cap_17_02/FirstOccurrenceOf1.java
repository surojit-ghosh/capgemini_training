package cap_17_02;

public class FirstOccurrenceOf1 {
    static int firstOccurrence(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) {
//                return i;
//            }
//        }
//
//        return -1;

        int low = 0;
        int high = arr.length - 1;

        while (high >= low) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)) {
                return mid;
            } else if (arr[mid] == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 1, 1, 1, 1};

        System.out.println(firstOccurrence(arr));
    }
}