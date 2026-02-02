package cap_02_02.searching;

public class SquareRoot {
    static int findSquareRoot(int n) {
        int left = 0;
        int right = n;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midSquared = mid * mid;

            if (midSquared == n) {
                ans = mid;
            } else if (midSquared < n) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int number = 26;
        int squareRoot = findSquareRoot(number);
        System.out.println("The integer square root of " + number + " is: " + squareRoot);
    }
}
