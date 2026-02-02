package cap_02_02;

/*
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
*/

public class CountClumps {
//    static int countClumps(int[] arr) {
//        int currentElement = arr[0],
//                currentCount = 1,
//                clumps = 0;
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] == currentElement) {
//                currentCount++;
//            } else {
//                if (currentCount >= 2) {
//                    clumps++;
//
//                }
//                currentElement = arr[i];
//                currentCount = 1;
//            }
//        }
//
//        if (currentCount >= 2) {
//            clumps++;
//        }
//
//        return clumps;
//    }

//    static int countClumps(int[] arr) {
//        int clumps = 0;
//        int current;
//
//        for (int i = 0; i < arr.length -1; i++) {
//            if(arr[i] == arr[i +1]) {
//                clumps++;
//                current = arr[i];
//
//                while (i < arr.length && arr[i] == current) {
//                    i++;
//                }
//            }
//        }
//
//        return clumps;
//    }

    static int countClumps(int[] arr) {
        int clumps = 0;
        int current = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && arr[i] != current) {
                clumps++;
                current = arr[i];
            } else {
                current = arr[i];
            }
        }

        return clumps;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 4};
        int[] arr2 = {1, 1, 2, 1, 1};
        int[] arr3 = {1, 1, 1, 1, 1};

        System.out.println(countClumps(arr1)); // Output: 2
        System.out.println(countClumps(arr2)); // Output: 2
        System.out.println(countClumps(arr3)); // Output: 1
    }
}
