package cap_02_02.sorting;

import java.util.Arrays;

public class Waveform {
//    Waveform sorted array
    //int[] arr = {10, 5,  3, 2, 20, 100,70,80}
//
//    Waveform sorted array:
//
//            10 5 3 2 100 20 80 70

    public static void waveformSort(int[] array) {
        boolean less = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (less) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            } else {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            less = !less;
        }
    }


    public static void main(String[] args) {
        int [] arr = {10, 5, 3, 2, 20, 100, 70, 80};
        waveformSort(arr);
        System.out.println("Waveform sorted array: "+ Arrays.toString(arr));
    }
}
