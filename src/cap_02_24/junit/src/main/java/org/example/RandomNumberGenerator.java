package cap_24_02.junit.src.src.main.java.org.example;

public class RandomNumberGenerator {
    public int generateRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min should be less than or equal to Max");
        }
        // math.random() generates a random double between 0.0 (inclusive) and 1.0 (exclusive), so we use (int) to convert it to an integer and scale it to the desired range.
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    // Random.nextInt() is a method from the java.util.Random class that generates a random integer. It can be used in two ways:
    // 1. nextInt(int bound): This method generates a random integer from 0
    //    (inclusive) to the specified bound (exclusive). For example, nextInt(10) will generate a random integer between 0 and 9.
    // 2. nextInt(): This method generates a random integer that can be positive, negative, or zero.
    // It does not take any parameters and can return any integer value.

    public int generateRandomNumberUsingRandom(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min should be less than or equal to Max");
        }

        // java.util.Random is a class in the Java standard library that provides methods for generating random numbers.
        // The nextInt(int bound) method generates a random integer from 0 (inclusive) to the specified bound (exclusive).
        // To generate a random number between min and max, we can use the formula: random.nextInt(max - min + 1) + min.
        // This will give us a random integer between min and max (inclusive).
        java.util.Random random = new java.util.Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int min = 1;
        int max = 100;
        int randomNum = rng.generateRandomNumber(min, max);
        System.out.println("Generated random number between " + min + " and " + max + ": " + randomNum);
    }

}
