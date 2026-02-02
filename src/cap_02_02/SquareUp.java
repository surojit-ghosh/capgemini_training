package cap_02_02;

/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
*/

import java.util.Arrays;

public class SquareUp {
    static int[] squareUp(int n) {
        int[] ans = new int[n * n];

        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                ans[i * n + j] = 0;
//            }

            for (int j = n - i - 1; j < n; j++) {
                ans[i * n + j] = n - j;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] result = squareUp(4);

        System.out.println(Arrays.toString(result));
    }
}
