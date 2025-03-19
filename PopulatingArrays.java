import java.util.Random;
import java.util.Arrays;

/**
 * This program populates an array with random numbers and sorts it.
 * It then calculates the average of the numbers in the array.
 * @author Alex Kapajika
 * @version 1.0
 * @since 2025-03-18
 */
public final class PopulatingArrays {
    /** Defining MAX_SIZE. */
    private static final int MAX_SIZE = 10;
    /** Defining MAX_VALUE. */
    private static final int MAX_VALUE = 101;
    /** Defining MAX_ARRAYS. */
    private static final int MAX_ARRAYS = 5;
    /**
     * This is to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private PopulatingArrays() {
        throw new IllegalStateException("Utility Class");
    }

    /**
     * Main Method.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {
        Random random = new Random();
        // Creating an array of 10 integers
        int[] numArray = new int[MAX_SIZE];
        // Populating the array with 10 random numbers
        for (int counterArray = 0; counterArray < MAX_ARRAYS; counterArray++) {
            int sum = 0;
            // Filling the array with random numbers
            for (int counter = 0; counter < MAX_SIZE; counter++) {
                int randomNum = random.nextInt(MAX_VALUE);
                numArray[counter] = randomNum;
                sum += randomNum;
            }
            // Printing the unsorted array after populating
            System.out.println("Unsorted array " + (counterArray + 1)
             + ": " + Arrays.toString(numArray));
            // Sorting the array
            Arrays.sort(numArray);
            // Printing the sorted array
            float averageSum = (float) sum / MAX_SIZE;
            System.out.println("Sorted array " + (counterArray + 1)
            + ": " + Arrays.toString(numArray) + " The average is: "
            + averageSum);
        }
    }
}
